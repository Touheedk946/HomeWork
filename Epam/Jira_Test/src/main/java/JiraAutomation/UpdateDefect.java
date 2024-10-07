package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class UpdateDefect {

    public static void updateDefect(String issueKey) {
        JSONObject updatePayload = new JSONObject();
        updatePayload.put("fields", new JSONObject()
                .put("description", "Defect description updated using API")
        );

        HttpResponse<JsonNode> response = Unirest.put(JiraConfig.BASE_URL + "/issue/" + issueKey)
                .header("Authorization", JiraConfig.AUTH)
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
}
