package com.example.starverse.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.starverse.Dao.CredentialDao;
import com.example.starverse.Dao.HoroscopeDao;
import com.example.starverse.Entities.Credential;
import com.example.starverse.Entities.Horoscope;

@Database(
        entities = {
                Credential.class,
                Horoscope.class
        },
        version = 1
)
public abstract class MyRoomDB extends RoomDatabase {

    private static final String dbName = "starverse.db";
    private static MyRoomDB myRoomDB;

    public static synchronized MyRoomDB getMyRoomDB(Context context) {
        if (myRoomDB == null) {
            myRoomDB = Room.databaseBuilder(context, MyRoomDB.class, dbName)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return myRoomDB;
    }

    public abstract HoroscopeDao horoscopeDao();
    public abstract CredentialDao credentialDao();
}
