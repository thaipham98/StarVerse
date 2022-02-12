package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.starverse.Database.DatabaseHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler databaseHandler = new DatabaseHandler(this);
    }
}