package com.example.starverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.example.starverse.Dao.HoroscopeDao;
import com.example.starverse.Database.DatabaseHandler;
import com.example.starverse.Database.MyRoomDB;
import com.example.starverse.Entities.Horoscope;

public class MainActivity extends AppCompatActivity {

    DatePicker DOB;
    Button start_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler databaseHandler = new DatabaseHandler(getApplicationContext());

        DOB = (DatePicker) findViewById(R.id.main_datePicker1);
        DOB.init(2011, 8, 2, null);
        start_button = findViewById(R.id.start);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int date_of_birth = DOB.getDayOfMonth();
                final int month_of_birth = DOB.getMonth() + 1;

                MyRoomDB myRoomDB = MyRoomDB.getMyRoomDB(getApplicationContext());
                final HoroscopeDao horoscopeDao = myRoomDB.horoscopeDao();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Horoscope horoscope = horoscopeDao.findHoroscope(date_of_birth, month_of_birth);
                        if (horoscope == null) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                   System.out.println("Doesn't exist for some reasons!");
                                }
                            });
                        } else {
                            openProfilePage(view);
                        }
                        myRoomDB.close();
                    }
                }).start();
            }
        });
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