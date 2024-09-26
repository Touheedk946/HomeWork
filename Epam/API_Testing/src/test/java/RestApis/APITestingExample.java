package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITestingExample {
    public static void main(String[] args) {
        // Base URI of the API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request to fetch all posts
        Response response = RestAssured.get("/posts");

        // Print response body
        System.out.println("Response Body: " + response.getBody().asString());

        // Validate status code
        if (response.getStatusCode() == 200) {
            System.out.println("Status code is 200 - Test Passed!");
        } else {
            System.out.println("Test Failed! Status code: " + response.getStatusCode());
        }
    }
}

