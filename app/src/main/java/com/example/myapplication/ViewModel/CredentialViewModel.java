package com.example.myapplication.ViewModel;

import javax.inject.Inject;

public class CredentialViewModel {

    @Inject
    public CredentialViewModel() {}

    public String getLoginCreds() {
        return "My Login Credentils Are : ";
    }

}
