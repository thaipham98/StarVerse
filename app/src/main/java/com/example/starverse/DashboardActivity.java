package com.example.starverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
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