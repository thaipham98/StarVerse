package com.example.starverse.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {
    public User(String info, Gender genderInterest, Preference preference, Integer from_age, Integer to_age) {
        this.info = info;
        this.genderInterest = genderInterest;
        this.preference = preference;
        this.from_age = from_age;
        this.to_age = to_age;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(Integer monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Gender getGenderInterest() {
        return genderInterest;
    }

    public void setGenderInterest(Gender genderInterest) {
        this.genderInterest = genderInterest;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    public Integer getFrom_age() {
        return from_age;
    }

    public void setFrom_age(Integer from_age) {
        this.from_age = from_age;
    }

    public Integer getTo_age() {
        return to_age;
    }

    public void setTo_age(Integer to_age) {
        this.to_age = to_age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDateInterest() {
        return dateInterest;
    }

    public void setDateInterest(String dateInterest) {
        this.dateInterest = dateInterest;
    }

    public String getUsernameInterest() {
        return usernameInterest;
    }

    public void setUsernameInterest(String usernameInterest) {
        this.usernameInterest = usernameInterest;
    }

    @androidx.annotation.NonNull
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name = "date_of_birth)")
    private Integer dateOfBirth;

    @ColumnInfo(name = "month_of_birth)")
    private Integer monthOfBirth;

    @ColumnInfo(name = "year_of_birth)")
    private Integer yearOfBirth;

    @ColumnInfo(name = "gender")
    private Gender gender;

    @ColumnInfo(name = "info")
    private String info;

    @ColumnInfo(name = "gender_interest")
    private Gender genderInterest;

    @ColumnInfo(name = "preference")
    private Preference preference;

    @ColumnInfo(name = "from_age")
    private Integer from_age;

    @ColumnInfo(name = "to_age")
    private Integer to_age;

    @ColumnInfo(name = "image")
    private String image;

    @ColumnInfo(name = "status")
    private Status status;

    @ColumnInfo(name = "date_interest")
    private String dateInterest;

    @ColumnInfo(name = "username_interest")
    private String usernameInterest;

}
