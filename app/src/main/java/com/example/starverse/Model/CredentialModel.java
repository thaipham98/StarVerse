package com.example.starverse.Model;

import com.example.starverse.Database.CredentialDatabase;
import com.example.starverse.Entities.Credential;

public class CredentialModel {

    public Credential getCredential(Credential credential) {
        CredentialDatabase.getDatabase(getApplicationContext()).getDao().signI(id);
    }
}
