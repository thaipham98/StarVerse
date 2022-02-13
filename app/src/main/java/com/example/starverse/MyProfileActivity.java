package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }

    public void openDashBoardPage(View view) {
        Intent i = new Intent(this, DashboardActivity.class);
        startActivity(i);
    }

    public void openChathubPage(View view) {
        Intent i = new Intent(this, ChatMatchActivity.class);
        startActivity(i);
    }

    public void openMyProfilePage(View view) {
        Intent i = new Intent(this, MyProfileActivity.class);
        startActivity(i);
    }
}