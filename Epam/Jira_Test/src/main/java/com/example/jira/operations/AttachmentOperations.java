package com.example.jira.operations;

import com.example.jira.client.JiraClient;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class AttachmentOperations {

    private final JiraClient jiraClient;

    public AttachmentOperations(JiraClient jiraClient) {
        this.jiraClient = jiraClient;
    }

    public void addAttachment(String issueIdOrKey, String filePath) throws Exception {
        String endpoint = "/rest/api/3/issue/" + issueIdOrKey + "/attachments";
        byte[] fileData = Files.readAllBytes(Paths.get(filePath));
        String encodedFile = Base64.getEncoder().encodeToString(fileData);

        String payload = String.format("{\"file\":\"%s\"}", encodedFile);
        jiraClient.sendPost(endpoint, payload);
    }
}
