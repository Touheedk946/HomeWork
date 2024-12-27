package com.example.jira.utils;

import java.util.Base64;

public class AuthUtils {

    public static String encodeCredentials(String username, String password) {
        String credentials = username + ":" + password;
        return "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
    }
}
