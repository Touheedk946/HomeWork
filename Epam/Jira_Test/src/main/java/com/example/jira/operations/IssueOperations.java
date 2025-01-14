package com.example.jira.operations;

import com.example.jira.client.JiraClient;
import org.codehaus.jettison.json.JSONObject;

public class IssueOperations {

    private final JiraClient jiraClient;

    public IssueOperations(JiraClient jiraClient) {
        this.jiraClient = jiraClient;
    }

    public String createIssue(String projectKey, String summary, String description) throws Exception {
        // Construct the JSON payload for creating an issue
        String jsonPayload = String.format(
                "{ \"fields\": { \"project\": { \"key\": \"%s\" }, \"summary\": \"%s\", \"description\": \"%s\", \"issuetype\": { \"name\": \"Bug\" } } }",
                projectKey, summary, description
        );

        // Call JiraClient to send the POST request
        String response = jiraClient.sendPost("/rest/api/3/issue", jsonPayload);

        // Log the response for debugging purposes
        System.out.println("Create Issue Response: " + response);

        // Parse the response JSON
        if (response.contains("errorMessages") || response.contains("errors")) {
            // Handle error responses by throwing an exception with details
            throw new Exception("Failed to create issue. Response: " + response);
        }

        // Extract the 'id' field from the JSON response
        JSONObject jsonResponse = new JSONObject(response);
        return jsonResponse.getString("id");
    }


    public void updateIssue(String issueIdOrKey, String newSummary) throws Exception {
        String jsonPayload = String.format("{ \"fields\": { \"summary\": \"%s\" } }", newSummary);
        jiraClient.sendPut("/rest/api/3/issue/" + issueIdOrKey, jsonPayload);
    }

    public String getIssue(String issueIdOrKey) throws Exception {
        return jiraClient.sendGet("/rest/api/3/issue/" + issueIdOrKey);
    }

    public void deleteIssue(String issueIdOrKey) throws Exception {
        jiraClient.sendDelete("/rest/api/3/issue/" + issueIdOrKey);
    }
}
