package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChatMatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_match);
    }

    public void openDashBoardPage(View view) {
        Intent i = new Intent(this, DashboardActivity.class);
        startActivity(i);
    }

    public void openChathubPage(View view) {
        Intent i = new Intent(this, ChatMatchActivity.class);
        startActivity(i);
    }

    public void openChatRegPage(View view){
        Intent i = new Intent(this, ChatActivity.class);
        startActivity(i);
    }
}