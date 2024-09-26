package RestApis;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class JSONPlaceholderAPITest {

    String baseURI = "https://jsonplaceholder.typicode.com";
    int postId, commentId, albumId, photoId, todoId, userId;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = baseURI;
    }

    // Task 1: Verify the number of resources at each endpoint
    @Test(priority = 1)
    public void verifyResourceCounts() {
        verifyResourceCount("/posts");
        verifyResourceCount("/comments");
        verifyResourceCount("/albums");
        verifyResourceCount("/photos");
        verifyResourceCount("/todos");
        verifyResourceCount("/users");
    }

    private void verifyResourceCount(String endpoint) {
        Response response = given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .extract().response();

        int count = response.jsonPath().getList("").size(); // Get count of resources
        System.out.println("Number of resources at " + endpoint + ": " + count);
    }

    // Task 2: For each resource type
    @Test(priority = 2)
    public void managePosts() {
        // a. Get specific resource data (posts)
        getResourceData("/posts/1"); // Get post with ID 1
        // b. Modify specific resource data
        modifyResourceData("/posts/1", "{\"title\":\"Updated Post\", \"body\":\"This is an updated post.\"}");
        // c. Delete a specific resource
        deleteResource("/posts/1");
        // d. Create a new resource
        createResource("/posts", "{\"title\":\"New Post\", \"body\":\"This is a new post.\", \"userId\":1}");
    }

    @Test(priority = 3)
    public void manageComments() {
        getResourceData("/comments/1"); // Get comment with ID 1
        modifyResourceData("/comments/1", "{\"body\":\"Updated Comment\"}");
        deleteResource("/comments/1");
        createResource("/comments", "{\"postId\":1, \"name\":\"New Commenter\", \"email\":\"commenter@example.com\", \"body\":\"This is a new comment.\"}");
    }

    @Test(priority = 4)
    public void manageAlbums() {
        getResourceData("/albums/1"); // Get album with ID 1
        modifyResourceData("/albums/1", "{\"title\":\"Updated Album\"}");
        deleteResource("/albums/1");
        createResource("/albums", "{\"title\":\"New Album\"}");
    }

    @Test(priority = 5)
    public void managePhotos() {
        getResourceData("/photos/1"); // Get photo with ID 1
        modifyResourceData("/photos/1", "{\"title\":\"Updated Photo\"}");
        deleteResource("/photos/1");
        createResource("/photos", "{\"albumId\":1, \"title\":\"New Photo\", \"url\":\"http://example.com/photo.jpg\", \"thumbnailUrl\":\"http://example.com/photo_thumb.jpg\"}");
    }

    @Test(priority = 6)
    public void manageTodos() {
        getResourceData("/todos/1"); // Get todo with ID 1
        modifyResourceData("/todos/1", "{\"title\":\"Updated Todo\", \"completed\":true}");
        deleteResource("/todos/1");
        createResource("/todos", "{\"title\":\"New Todo\", \"completed\":false, \"userId\":1}");
    }

    @Test(priority = 7)
    public void manageUsers() {
        getResourceData("/users/1"); // Get user with ID 1
        modifyResourceData("/users/1", "{\"name\":\"Updated User\"}");
        deleteResource("/users/1");
        createResource("/users", "{\"name\":\"New User\", \"username\":\"newuser\", \"email\":\"newuser@example.com\"}");
    }

    // Helper methods to handle resource operations
    private void getResourceData(String endpoint) {
        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .body(not(emptyOrNullString())); // Ensure body is not empty
    }

    private void modifyResourceData(String endpoint, String requestBody) {
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put(endpoint)
                .then()
                .statusCode(200)
                .body("title", containsString("Updated")); // Ensure title contains "Updated"
    }

    private void deleteResource(String endpoint) {
        given()
                .when()
                .delete(endpoint)
                .then()
                .statusCode(200)
                .body("message", equalTo("Resource deleted")); // Placeholder for message
    }

    private void createResource(String endpoint, String requestBody) {
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .statusCode(201)
                .body("title", anyOf(
                        containsString("Post"),
                        containsString("Comment"),
                        containsString("Album"),
                        containsString("Photo"),
                        containsString("Todo"),
                        containsString("User")
                ));
    }

}
