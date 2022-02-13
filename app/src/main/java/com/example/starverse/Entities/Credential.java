package com.example.starverse.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.NonNull;

@Entity(tableName = "Credentials")
public class Credential {
    @ColumnInfo(name = "email")
    @NonNull
    private String email;

    @ColumnInfo(name = "password")
    @NonNull
    private String password;

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "username")
    @androidx.annotation.NonNull
    private String username;

    public Credential(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
