package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void openSigninPage(View view) {
        Intent i = new Intent(this, SigninActivity.class);
        startActivity(i);
    }

    public void openCreateProfilePage(View view) {
        Intent i = new Intent(this, CreateProfileActivity.class);
        startActivity(i);
    }



}