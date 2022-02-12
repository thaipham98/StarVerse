package com.example.starverse.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.starverse.Entities.Credential;

@Dao
public interface CredentialDao {

    @Insert
    void signUp(Credential credential);

    @Query("select * from credential where username = :username and password = :password")
    Credential signIn(String username, String password);
}
