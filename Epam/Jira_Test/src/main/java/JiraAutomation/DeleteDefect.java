package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class DeleteDefect {

    public static void deleteDefect(String issueKey) {
        HttpResponse<JsonNode> response = Unirest.delete(JiraConfig.BASE_URL + "/issue/" + issueKey)
                .header("Authorization", JiraConfig.AUTH)
                .header("Accept", "application/json")
                .asJson();

        if (response.getStatus() == 204) {
            System.out.println("Defect Deleted Successfully: " + issueKey);
        } else {
            System.out.println("Failed to delete defect: " + response.getStatusText());
        }
    }
}

