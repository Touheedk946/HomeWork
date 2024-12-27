package com.example.jira;

import com.example.jira.client.JiraClient;
import com.example.jira.operations.IssueOperations;
import com.example.jira.utils.AuthUtils;

public class Main {

    public static void main(String[] args) throws Exception {
        String baseUrl = "https://your-domain.atlassian.net";
        String username = "touheed_khan@epam.com";
        String password = "bt5019DPa2#YU";

        String authHeader = AuthUtils.encodeCredentials(username, password);
        JiraClient jiraClient = new JiraClient(baseUrl, authHeader);

        IssueOperations issueOps = new IssueOperations(jiraClient);

        // Create Issue
        String issueId = issueOps.createIssue("TEST", "Sample Bug", "This is a test bug");
        System.out.println("Created Issue ID: " + issueId);

        // Get Issue
        System.out.println("Issue Details: " + issueOps.getIssue(issueId));

        // Update Issue
        issueOps.updateIssue(issueId, "Updated Bug Summary");

        // Delete Issue
        issueOps.deleteIssue(issueId);
    }
}
