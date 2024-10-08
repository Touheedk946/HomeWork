package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class CreateDefect {

    public static String createDefect() {
        // JSON payload as a raw string
        String jsonPayload = "{\n" +
                "    \"fields\": {\n" +
                "        \"project\": {\n" +
                "            \"key\": \"SCRUM\"\n" +
                "        },\n" +
                "        \"issuetype\": {\n" +
                "            \"id\": \"10001\"\n" +
                "        },\n" +
                "        \"summary\": \"created via REST API Automation\",\n" +
                "        \"description\": {\n" +
                "            \"type\": \"doc\",\n" +
                "            \"version\": 1,\n" +
                "            \"content\": [\n" +
                "                {\n" +
                "                    \"type\": \"paragraph\",\n" +
                "                    \"content\": [\n" +
                "                        {\n" +
                "                            \"type\": \"text\",\n" +
                "                            \"text\": \"description\"\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";

        // Sending the POST request to create the defect using the raw JSON string
        HttpResponse<JsonNode> response = Unirest.post(JiraConfig.BASE_URL)
                .header("Authorization", JiraConfig.AUTH)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(jsonPayload) // Using the raw JSON string here
                .asJson();

        // Checking the response status and printing the result
        if (response.getStatus() == 201) {
            String issueIdOrKey = response.getBody().getObject().getString("key");
            System.out.println("Defect Created: " + issueIdOrKey);
            return issueIdOrKey;
        } else if (response.getStatus() == 200) {
            System.out.println("Request was successful but returned no issue key.");
        } else {
            System.out.println("Failed to create defect: " + response.getStatusText());
        }
        return null;
    }
}
