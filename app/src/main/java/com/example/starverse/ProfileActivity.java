package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView zodiac_name = findViewById(R.id.profile_text_zodiac);
        zodiac_name.setText("Yosyewghselhgv se");

//        horoscopeName = findViewById(R.id.)
    }

    public void openSignupPage(View view) {
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
    }
}