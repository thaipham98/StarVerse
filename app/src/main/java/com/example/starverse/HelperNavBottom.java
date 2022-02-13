package com.example.starverse;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HelperNavBottom extends AppCompatActivity {

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
