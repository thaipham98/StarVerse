package com.example.starverse.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.NonNull;

@Entity(tableName = "Horoscope")
public class Horoscope {
    @ColumnInfo(name = "date_of_birth")
    @NonNull
    private int date_of_birth;

    @ColumnInfo(name = "month_of_birth")
    @NonNull
    private int month_of_birth;


    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "name")
    @androidx.annotation.NonNull
    private String name;

    @ColumnInfo(name = "description")
    @NonNull
    private String description;

    @ColumnInfo(name = "image")
    @NonNull
    private String image;


    public Horoscope(int date_of_birth, int month_of_birth, String name, String description, String image) {
        this.date_of_birth = date_of_birth;
        this.month_of_birth = month_of_birth;
        this.name = name;
        this.description = description;
        this.image = image;
    }


    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public void setMonth_of_birth(int month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
