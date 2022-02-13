package com.example.starverse;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.starverse.Dao.CredentialDao;
import com.example.starverse.Database.CredentialDatabase;
import com.example.starverse.Entities.Credential;


public class SignupActivity extends AppCompatActivity {

    EditText email, password, username;
    Button sign_up, login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        sign_up = findViewById(R.id.sign_up);
        login = findViewById(R.id.login);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String usernameText = username.getText().toString();
                final String emailText = email.getText().toString();
                final String passwordText = password.getText().toString();

                if (emailText.isEmpty() || passwordText.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fill all Fields", Toast.LENGTH_SHORT).show();
                } else {
                    CredentialDatabase credentialDatabase = CredentialDatabase.getCredentialDatabase(getApplicationContext());
                    final CredentialDao credentialDao = credentialDatabase.credentialDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            Credential credential = new Credential(usernameText, emailText, passwordText);
                            credentialDao.signUp(credential);
                            if (credential == null) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } else {
                                openDashBoard(v);
                            }
                        }
                    }).start();
                }
            }
        });
    }

    public void openProfilePage(View view) {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }

    public void openCreateProfilePage(View view) {
        Intent i = new Intent(this, CreateProfileActivity.class);
        startActivity(i);
    }

    public void openDashBoard(View view) {
        Intent i = new Intent(this, DashboardActivity.class);
        startActivity(i);
    }



}