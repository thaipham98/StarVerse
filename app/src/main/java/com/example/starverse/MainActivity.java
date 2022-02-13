package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.starverse.Database.DatabaseHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler databaseHandler = new DatabaseHandler(getApplicationContext());
    }

    public void openProfilePage(View view) {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }

    public void openSigninPage(View view) {
        Intent i = new Intent(this, SigninActivity.class);
        startActivity(i);
    }
}