package com.example.jira.operations;

import com.example.jira.client.JiraClient;

public class IssueOperations {

    private final JiraClient jiraClient;

    public IssueOperations(JiraClient jiraClient) {
        this.jiraClient = jiraClient;
    }

    public String createIssue(String projectKey, String summary, String description) throws Exception {
        String jsonPayload = String.format(
                "{ \"fields\": { \"project\": { \"key\": \"%s\" }, \"summary\": \"%s\", \"description\": \"%s\", \"issuetype\": { \"name\": \"Bug\" } } }",
                projectKey, summary, description
        );
        return jiraClient.sendPost("/rest/api/3/issue", jsonPayload);
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
