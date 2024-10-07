package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class CreateDefect {

    public static String createDefect() {
        JSONObject defectPayload = new JSONObject();
        defectPayload.put("fields", new JSONObject()
                .put("project", new JSONObject().put("key", "PROJ_KEY")) // Replace with your Project Key
                .put("summary", "Defect created using API")
                .put("description", "Creating a defect through automation")
                .put("issuetype", new JSONObject().put("name", "Bug")) // Defect type can be "Bug", "Task", etc.
        );

        HttpResponse<JsonNode> response = Unirest.post(JiraConfig.BASE_URL + "/issue")
                .header("Authorization", JiraConfig.AUTH)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(defectPayload)
                .asJson();

        if (response.getStatus() == 201) {
            String issueIdOrKey = response.getBody().getObject().getString("key");
            System.out.println("Defect Created: " + issueIdOrKey);
            return issueIdOrKey;
        } else {
            System.out.println("Failed to create defect: " + response.getStatusText());
            return null;
        }
    }
}
