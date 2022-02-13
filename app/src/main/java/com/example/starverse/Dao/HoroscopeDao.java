package com.example.starverse.Dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.starverse.Entities.Horoscope;

@Dao
public interface HoroscopeDao {


    @Query("select * from Horoscope where date_of_birth = :date_of_birth and month_of_birth = :month_of_birth")
    Horoscope findHoroscope(int date_of_birth, int month_of_birth);
}
