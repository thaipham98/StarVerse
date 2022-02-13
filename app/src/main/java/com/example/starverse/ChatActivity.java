package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    public void openChathubPage(View view) {
        Intent i = new Intent(this, ChatMatchActivity.class);
        startActivity(i);
    }


    public void openChatRegPage(View view){
        Intent i = new Intent(this, MyProfileActivity.class);
        startActivity(i);
    }
}