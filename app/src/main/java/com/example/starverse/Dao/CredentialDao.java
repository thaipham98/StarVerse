package com.example.starverse.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.starverse.Entities.Credential;

@Dao
public interface CredentialDao {

    @Insert
    void signUp(Credential credential);

    @Query("select * from Credentials where email = (:email) and password = (:password)")
    Credential signIn(String email, String password);
}
