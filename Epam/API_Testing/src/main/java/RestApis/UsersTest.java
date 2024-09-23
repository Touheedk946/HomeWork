package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UsersTest {

    public static void main(String[] args) {
        // Set the base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Perform the GET request
        // Perform GET request
        Response response =
                given()
                        .when()
                        .get("/users")
                        .then()
                        // Assert status code is 200
                        .statusCode(200)
                        // Assert that the response content type is JSON
                        .contentType("application/json; charset=utf-8")
                        // Assert there are more than 3 users
                        .body("size()", greaterThan(3))
                        // Assert one of the users has a name "Ervin Howell"
                        .body("find { it.name == 'Ervin Howell' }.name", equalTo("Ervin Howell"))
                        .extract()
                        .response();

        // Print the response for reference
        System.out.println(response.asString());
    }
}
