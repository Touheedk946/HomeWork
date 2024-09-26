package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BearerTokenExample {
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://api.example.com";

        // Bearer Token Authentication
        Response response = RestAssured
                .given()
                .auth()
                .oauth2("your_bearer_token")
                .get("/protected-data");

        // Print response
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Status Code: " + response.getStatusCode());
    }
}

