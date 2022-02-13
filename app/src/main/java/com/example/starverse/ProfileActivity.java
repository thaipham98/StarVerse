package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView zodiac_name = findViewById(R.id.profile_text_zodiac);
        zodiac_name.setText("You are taurus!");

        TextView profile_text_description = findViewById(R.id.profile_text_description);
        profile_text_description.setMovementMethod(new ScrollingMovementMethod());
    }

    public void openSignupPage(View view) {
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
    }
}