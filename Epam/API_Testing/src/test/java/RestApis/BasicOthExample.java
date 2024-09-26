package RestApis;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicOthExample {
    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://api.example.com";

        // Basic Authentication
        Response response = RestAssured
                .given()
                .auth()
                .preemptive()
                .basic("username", "password")
                .get("/secure-data");

        // Print response
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Status Code: " + response.getStatusCode());
    }
}

