package JiraAutomation;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.io.File;

public class AddAttachment {

    public static void addAttachment(String issueKey, String filePath) {
        HttpResponse<JsonNode> response = Unirest.post(JiraConfig.BASE_URL + "/issue/" + issueKey + "/attachments")
                .header("Authorization", JiraConfig.AUTH)
                .header("X-Atlassian-Token", "no-check")
                .field("file", new File(filePath)) // Specify your attachment path here
                .asJson();

        if (response.getStatus() == 200) {
            System.out.println("Attachment added successfully to: " + issueKey);
        } else {
            System.out.println("Failed to add attachment: " + response.getStatusText());
        }
    }
}

