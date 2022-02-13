package com.example.starverse.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Horoscope")
public class Horoscope {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "keyId")
    @NonNull
    private Integer keyId;

    @NonNull
    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(@NonNull Integer keyId) {
        this.keyId = keyId;
    }

    public void setDate_of_birth(Integer date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setMonth_of_birth(Integer month_of_birth) {
        this.month_of_birth = month_of_birth;
    }

    @ColumnInfo(name = "date_of_birth")
    private Integer date_of_birth;


    @ColumnInfo(name = "month_of_birth")
    private Integer month_of_birth;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "image")
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
