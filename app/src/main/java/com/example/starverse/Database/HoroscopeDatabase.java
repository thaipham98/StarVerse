package com.example.starverse.Database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.starverse.Dao.HoroscopeDao;
import com.example.starverse.Entities.Horoscope;

@androidx.room.Database(entities = {Horoscope.class}, version = 25, exportSchema = true)
public abstract class HoroscopeDatabase extends RoomDatabase {

    private static final String dbName = "starverse.db";
    private static HoroscopeDatabase horoscopeDatabase;

    public static synchronized HoroscopeDatabase getHoroscopeDatabase(Context context) {
        if (horoscopeDatabase == null) {
            horoscopeDatabase = Room.databaseBuilder(context, HoroscopeDatabase.class, dbName)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return horoscopeDatabase;
    }

    public abstract HoroscopeDao horoscopeDao();
}
