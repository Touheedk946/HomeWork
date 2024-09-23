package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class EmployeeAPITest1 {

    String baseURI = "http://example.com/api/v1"; // Replace with the actual API base URI

    // This test will fetch the list of employees and verify the count.
    @Test(priority = 1)
    public void getAllEmployeesAndVerifyCount() {
        RestAssured.baseURI = baseURI;

        // Perform GET request to get the list of employees
        Response response = given()
                .when()
                .get("/employees")
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Get the count of employees
        int initialCount = response.jsonPath().getList("data").size();

        // Print the initial count for reference
        System.out.println("Initial count of employees: " + initialCount);

        // Verify that the employee count is greater than 0
        response.then().body("data.size()", greaterThan(0));
    }

    // This test will create a new employee and verify that the count increases by 1
    @Test(priority = 2)
    public void createEmployeeAndVerifyCountIncrement() {
        RestAssured.baseURI = baseURI;

        // First, get the initial count of employees
        Response initialResponse = given()
                .when()
                .get("/employees")
                .then()
                .statusCode(200)
                .extract()
                .response();

        int initialCount = initialResponse.jsonPath().getList("data").size();

        // Create a new employee (Example data)
        String requestBody = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"salary\": \"50000\",\n" +
                "  \"age\": \"30\"\n" +
                "}";

        // POST request to create a new employee
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/employees")
                .then()
                .statusCode(201) // Verify that employee is created successfully
                .body("message", equalTo("Employee created"));

        // After creation, verify that the count of employees has increased by 1
        Response finalResponse = given()
                .when()
                .get("/employees")
                .then()
                .statusCode(200)
                .extract()
                .response();

        int finalCount = finalResponse.jsonPath().getList("data").size();

        // Verify the count has increased by 1
        assert finalCount == initialCount + 1 : "Employee count did not increase by 1";

        System.out.println("Employee created successfully, count increased by 1");
    }
}

