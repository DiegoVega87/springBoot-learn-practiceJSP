package com.buildwebapps.practice.myfirstjavawebapp.login;

import org.springframework.stereotype.Service;

public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean isValidUsername = username.equals("admin");
        boolean isValidPassword = password.equals("dummy");

        return isValidUsername && isValidPassword;
    }
}
