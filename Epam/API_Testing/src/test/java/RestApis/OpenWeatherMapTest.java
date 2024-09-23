package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class OpenWeatherMapTest {

    @Test
    public void getWeatherForHyderabad() {
        // Set the base URI for RestAssured
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5";

        // API Key from OpenWeatherMap (Replace with your actual key)
        String apiKey = "your_api_key_here";

        // Perform GET request to fetch weather details for Hyderabad
        Response response =
                given()
                        .queryParam("q", "hyderabad")
                        .queryParam("appid", apiKey)
                        .when()
                        .get("/weather")
                        .then()
                        // Assert that the status code is 200
                        .statusCode(200)
                        // Validate that the response is in JSON format
                        .contentType("application/json")
                        // Extract the response
                        .extract()
                        .response();

        // Print the response for reference
        System.out.println(response.asString());

        // Additional assertions (example: check city name is "Hyderabad")
        response.then().body("name", equalTo("Hyderabad"));
    }
}

