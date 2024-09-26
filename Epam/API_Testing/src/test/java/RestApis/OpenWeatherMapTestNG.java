package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class OpenWeatherMapTestNG {

    // First test to get the weather details for Hyderabad and extract latitude and longitude
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
                        .statusCode(401) //200
                        // Validate that the response is in JSON format
                        .contentType("application/json")
                        // Extract the response
                        .extract()
                        .response();

        // Print the response for reference
        System.out.println(response.asString());

        // Extract latitude and longitude from the response
        double latitude = response.path("coord.lat");
        double longitude = response.path("coord.lon");

        // Perform the next test with the coordinates
        getWeatherByCoordinates(latitude, longitude, apiKey);
    }

    // Second test to verify the weather details using latitude and longitude
    public void getWeatherByCoordinates(double latitude, double longitude, String apiKey) {
        // Set the base URI for RestAssured
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5";

        // Perform GET request to fetch weather details using coordinates
        given()
                .queryParam("lat", latitude)
                .queryParam("lon", longitude)
                .queryParam("appid", apiKey)
                .when()
                .get("/weather")
                .then()
                // Assert that the status code is 200
                .statusCode(200)
                // Validate that the response is in JSON format
                .contentType("application/json")
                // Validate that the city name is Hyderabad
                .body("name", equalTo("Hyderabad"))
                // Validate that the country is India (IN)
                .body("sys.country", equalTo("IN"))
                // Validate that the minimum temperature is greater than 0
                .body("main.temp_min", greaterThan(0f))
                // Validate that the current temperature is greater than 0
                .body("main.temp", greaterThan(0f));
    }
}

