package com.example.starverse.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;


@Entity(tableName = "Credentials")
public class Credential {


    @androidx.annotation.NonNull
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(@androidx.annotation.NonNull String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "password")
    @NonNull
    private String password;
}
