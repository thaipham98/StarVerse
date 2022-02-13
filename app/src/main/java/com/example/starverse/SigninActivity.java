package com.example.starverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.starverse.Dao.CredentialDao;
import com.example.starverse.Database.CredentialDatabase;
import com.example.starverse.Entities.Credential;

public class SigninActivity extends AppCompatActivity {

    EditText email, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_signin);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = SigninActivity.this.email.getText().toString();
                final String passwordText = password.getText().toString();

                if (email.isEmpty() || passwordText.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fill all Fields", Toast.LENGTH_SHORT).show();
                } else {
                    CredentialDatabase credentialDatabase = CredentialDatabase.getCredentialDatabase(getApplicationContext());
                    final CredentialDao credentialDao = credentialDatabase.credentialDao();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            Credential credential = credentialDao.signIn(email, passwordText);
                            if (credential == null) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            } else {
                                System.out.println("got");




                            }
                        }
                    }).start();
                }

            }
        });

    }


}
