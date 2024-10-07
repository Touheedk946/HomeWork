
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class JiraAutomation {

    // Base URL of your JIRA instance
    private static final String BASE_URL = "https://your-jira-instance.atlassian.net/rest/api/3";
    // Authentication (Use Basic <Base64 encoded username:API_token>)
    private static final String AUTH = "Basic your_encoded_auth_token";
    private static String issueIdOrKey;

    public static void main(String[] args) {
        // 1. Create Defect
        createDefect();

        // 2. Update Defect
        updateDefect(issueIdOrKey);

        // 3. Search Defect
        searchDefect(issueIdOrKey);

        // 4. Add Attachment to Defect
        addAttachment(issueIdOrKey);

        // 5. Delete Defect
        deleteDefect(issueIdOrKey);
    }

    private static void createDefect() {
        JSONObject defectPayload = new JSONObject();
        defectPayload.put("fields", new JSONObject()
                .put("project", new JSONObject().put("key", "PROJ_KEY")) // Replace with your Project Key
                .put("summary", "Defect created using API")
                .put("description", "Creating a defect through automation")
                .put("issuetype", new JSONObject().put("name", "Bug")) // Defect type can be "Bug", "Task", etc.
        );

        HttpResponse<JsonNode> response = Unirest.post(BASE_URL + "/issue")
                .header("Authorization", AUTH)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(defectPayload)
                .asJson();

        if (response.getStatus() == 201) {
            issueIdOrKey = response.getBody().getObject().getString("key");
            System.out.println("Defect Created: " + issueIdOrKey);
        } else {
            System.out.println("Failed to create defect: " + response.getStatusText());
        }
    }

    private static void updateDefect(String issueKey) {
        JSONObject updatePayload = new JSONObject();
        updatePayload.put("fields", new JSONObject()
                .put("description", "Defect description updated using API")
        );

        HttpResponse<JsonNode> response = Unirest.put(BASE_URL + "/issue/" + issueKey)
                .header("Authorization", AUTH)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(updatePayload)
                .asJson();

        if (response.getStatus() == 204) {
            System.out.println("Defect Updated Successfully: " + issueKey);
        } else {
            System.out.println("Failed to update defect: " + response.getStatusText());
        }
    }

    private static void searchDefect(String issueKey) {
        HttpResponse<JsonNode> response = Unirest.get(BASE_URL + "/issue/" + issueKey)
                .header("Authorization", AUTH)
                .header("Accept", "application/json")
                .asJson();

        if (response.getStatus() == 200) {
            System.out.println("Defect Found: " + response.getBody().getObject().toString());
        } else {
            System.out.println("Failed to find defect: " + response.getStatusText());
        }
    }

    private static void addAttachment(String issueKey) {
        HttpResponse<JsonNode> response = Unirest.post(BASE_URL + "/issue/" + issueKey + "/attachments")
                .header("Authorization", AUTH)
                .header("X-Atlassian-Token", "no-check")
                .field("file", new java.io.File("path/to/attachment.txt")) // Specify your attachment path here
                .asJson();

        if (response.getStatus() == 200) {
            System.out.println("Attachment added successfully to: " + issueKey);
        } else {
            System.out.println("Failed to add attachment: " + response.getStatusText());
        }
    }

    private static void deleteDefect(String issueKey) {
        HttpResponse<JsonNode> response = Unirest.delete(BASE_URL + "/issue/" + issueKey)
                .header("Authorization", AUTH)
                .header("Accept", "application/json")
                .asJson();

        if (response.getStatus() == 204) {
            System.out.println("Defect Deleted Successfully: " + issueKey);
        } else {
            System.out.println("Failed to delete defect: " + response.getStatusText());
        }
    }
}
