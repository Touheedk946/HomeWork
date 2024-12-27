package com.example.jira.utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class HttpUtils {

    public static Response sendGet(String url, String authToken) {
        return given()
                .header("Authorization", authToken)
                .header("Content-Type", "application/json")
                .get(url)
                .then()
                .extract()
                .response();
    }

    public static Response sendPut(String url, String authToken, String body) {
        return given()
                .header("Authorization", authToken)
                .header("Content-Type", "application/json")
                .body(body)
                .put(url)
                .then()
                .extract()
                .response();
    }
}
