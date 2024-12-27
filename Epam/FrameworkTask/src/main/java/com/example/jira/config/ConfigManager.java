package com.example.jira.config;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ConfigManager {
    private static final String BASE_URL = "https://your-domain.atlassian.net";
    private static final String USERNAME = "touheed_khan@epam.com"; // Replace with your Jira username
    private static final String PASSWORD = "bt5019DPa2#YU"; // Replace with your Jira password

    /**
     * Generates a Base64 encoded Basic Authentication token using username and password.
     *
     * @return The Basic Authentication token
     */
    public static String getAuthToken() {
        String credentials = USERNAME + ":" + PASSWORD;
        return "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
    }

    public static String getBaseUrl() {
        return BASE_URL;
    }
}
