package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;


public class EmployeeAPITest1 {
    int employeeId;
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
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .extract().response();

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

        // Create employee and capture employeeId
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/employees")
                .then()
                .statusCode(201)
                .statusLine("HTTP/1.1 201 Created")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .body("message", equalTo("Employee created"))
                .extract().response();


        employeeId = response.jsonPath().getInt("data.id"); // Store employee ID for further operations

        // Verify count increased by 1
        int finalCount = given().when().get("/employees").jsonPath().getList("data").size();
        assert finalCount == initialCount + 1 : "Employee count did not increase by 1";
    }

    // Step 3: Get the details of the employee created in step 2 and verify
    @Test(priority = 3)
    public void getEmployeeDetailsAndVerify() {
        given()
                .when()
                .get("/employees/" + employeeId)
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .body("data.id", equalTo(employeeId))
                .body("data.name", equalTo("John Doe"))
                .body("data.salary", equalTo("50000"))
                .body("data.age", equalTo("30"));
    }

    // Step 4: Update employee details (salary and age) and verify
    @Test(priority = 4)
    public void updateEmployeeDetailsAndVerify() {
        String updatedRequestBody = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"salary\": \"60000\",\n" +
                "  \"age\": \"35\"\n" +
                "}";

        given()
                .header("Content-Type", "application/json")
                .body(updatedRequestBody)
                .when()
                .put("/employees/" + employeeId)
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .body("message", equalTo("Employee updated"));
    }

    // Step 5: Get the details of the updated employee and verify the changes
    @Test(priority = 5)
    public void getUpdatedEmployeeDetailsAndVerify() {
        given()
                .when()
                .get("/employees/" + employeeId)
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .body("data.id", equalTo(employeeId))
                .body("data.name", equalTo("John Doe"))
                .body("data.salary", equalTo("60000"))
                .body("data.age", equalTo("35"));
    }

    // Step 6: Delete the employee created in step 2 and verify
    @Test(priority = 6)
    public void deleteEmployeeAndVerify() {
        // Get initial count before delete
        int initialCount = given().when().get("/employees").jsonPath().getList("data").size();

        // Perform DELETE request
        given()
                .when()
                .delete("/employees/" + employeeId)
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .header("Content-Encoding", "gzip")
                .body("message", equalTo("Employee deleted"));

        // Verify count decreased by 1
        int finalCount = given().when().get("/employees").jsonPath().getList("data").size();
        assert finalCount == initialCount - 1 : "Employee count did not decrease by 1";
    }

}

