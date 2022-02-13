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

    private static final int DATABASE_VERSION = 25;
    private static final String DATABASE_NAME = "starverse.db";
    private static final String TABLE_NAME = "Credentials";

    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";

    private static final String USER = "CREATE TABLE User (\n" +
            "\tusername TEXT PRIMARY KEY NOT NULL\n" +
            "\tdate_of_birth\tINTEGER\n" +
            "\tmonth_of_birth INTEGER\n" +
            "\tyear_of_birth INTEGER\n" +
            "\tgender INTEGER\n" +
            "\tinfo TEXT \n" +
            "\tlocation TEXT\n" +
            "\tgender_interest TEXT\n" +
            "\tpreferences TEXT\n" +
            "\tfrom_age INTEGER\n" +
            "\tto_age INTEGER\n" +
            "\timage TEXT\n" +
            "\tstatus TEXT\n" +
            "\tdate_interested TEXT\n" +
            "\tusername_interested TEXT\n" +
            ")\n";

    private static final String HOROSCOPE = "CREATE TABLE Horoscope (\n" +
            "\tkeyId INTEGER PRIMARY KEY NOT NULL,\n" +
            "\tdate_of_birth\tINTEGER,\n" +
            "\tmonth_of_birth INTEGER,\n" +
            "\tname TEXT,\n" +
            "\tdescription TEXT,\n" +
            "\timage TEXT\n" +
            ");\n";

    private static final String CHATCARD = "CREATE TABLE Chat_Card (\n" +
            "\tusername TEXT PRIMARY KEY NOT NULL,\n" +
            "\tstatus INTEGER,\n" +
            "\tpreview TEXT,\n" +
            "\tlast_active TEXT\n" +
            ");\n";

    private static final String INSERT_HORO = "INSERT INTO Horoscope (date_of_birth, month_of_birth, name, description, image)\n" +
            "VALUES (2,9,'Pieces','Fun', 'adfasfs');\n";



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + "(" + COLUMN_USERNAME + " TEXT PRIMARY KEY NOT NULL, " + COLUMN_EMAIL + " TEXT, " + COLUMN_PASSWORD + " TEXT)");
        //sqLiteDatabase.execSQL(USER);
        sqLiteDatabase.execSQL(HOROSCOPE);
        sqLiteDatabase.execSQL(CHATCARD);
        sqLiteDatabase.execSQL(INSERT_HORO);
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_NAME + " (" + COLUMN_USERNAME + ", " + COLUMN_EMAIL + ", " + COLUMN_PASSWORD + ")" + " VALUES ('thaipham', 'thaigmail.com', 'abc')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "Horoscope");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + "Chat_Card");
        onCreate(sqLiteDatabase);
    }
}
