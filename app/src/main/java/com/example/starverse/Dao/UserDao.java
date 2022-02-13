package com.example.starverse.Dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.starverse.Entities.Credential;
import com.example.starverse.Entities.User;

@Dao
public interface UserDao {

    @Insert
    void signUp(User user);
}
