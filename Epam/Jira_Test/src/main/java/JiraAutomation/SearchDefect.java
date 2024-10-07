package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class SearchDefect {

    public static void searchDefect(String issueKey) {
        HttpResponse<JsonNode> response = Unirest.get(JiraConfig.BASE_URL + "/issue/" + issueKey)
                .header("Authorization", JiraConfig.AUTH)
                .header("Accept", "application/json")
                .asJson();

        if (response.getStatus() == 200) {
            System.out.println("Defect Found: " + response.getBody().getObject().toString());
        } else {
            System.out.println("Failed to find defect: " + response.getStatusText());
        }
    }
}
