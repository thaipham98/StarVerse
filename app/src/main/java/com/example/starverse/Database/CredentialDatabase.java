package com.example.starverse.Database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.starverse.Dao.CredentialDao;
import com.example.starverse.Entities.Credential;

@androidx.room.Database(entities = {Credential.class}, version = 14)
public abstract class CredentialDatabase extends RoomDatabase {

    private static final String dbName = "starverse.db";
    private static CredentialDatabase credentialDatabase;

    public static synchronized CredentialDatabase getCredentialDatabase(Context context) {
        if (credentialDatabase == null) {
            credentialDatabase = Room.databaseBuilder(context, CredentialDatabase.class, dbName)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return credentialDatabase;
    }

    public abstract CredentialDao credentialDao();
}
