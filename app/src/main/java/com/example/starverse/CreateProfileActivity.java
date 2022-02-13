package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.starverse.Dao.UserDao;
import com.example.starverse.Database.MyRoomDB;
import com.example.starverse.Entities.User;

public class CreateProfileActivity extends AppCompatActivity {

    EditText interest, preference, fromAge, toAge, aboutMe;
    Button matching;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        matching = findViewById(R.id.match);
        matching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                final String interestText = "a";
//                final String preferenceText= "a";
//                final String fromAgeText = "a";
//                final String toAgeText = "a";
//                final String aboutMeText = "a";

                //                    MyRoomDB myRoomDB = MyRoomDB.getMyRoomDB(getApplicationContext());
//                    final UserDao userDao = myRoomDB.userDao();
                new Thread(new Runnable() {
                    @Override
                    public void run() {

//                            User user = new User(aboutMeText, interestText, preferenceText, fromAgeText, toAgeText);
//                            userDao.signUp(user);
//                            user = userDao.findUser()
                        openDashBoard(view);
                    }
                }).start();

            }
        });

    }

    public void openDashBoard(View view) {
        Intent i = new Intent(this, DashboardActivity.class);
        startActivity(i);
    }
}