package com.example.starverse.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    SQLiteDatabase database;

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        database = getWritableDatabase();
    }

    private static final int DATABASE_VERSION = 14;
    private static final String DATABASE_NAME = "starverse.db";
    private static final String TABLE_NAME = "Credentials";

    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + "(" + COLUMN_USERNAME + " TEXT PRIMARY KEY NOT NULL, " + COLUMN_EMAIL + " TEXT, " + COLUMN_PASSWORD + " TEXT)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_NAME + " (" + COLUMN_USERNAME + ", " + COLUMN_EMAIL + ", " + COLUMN_PASSWORD + ")" + " VALUES ('thaipham', 'thaigmail.com', 'abc')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
