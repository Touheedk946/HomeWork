package com.example.jira;

import com.example.jira.client.JiraClient;
import com.example.jira.operations.IssueOperations;
import com.example.jira.utils.AuthUtils;

public class Main {

    public static void main(String[] args) throws Exception {
        // Jira Base URL and Authentication Credentials
        String baseUrl = "https://epam.atlassian.net";
        String username = "touheed_khan@epam.com";
        String password = "bt5019DPa2#YU";

        // Encode Authentication Credentials
        String authHeader = AuthUtils.encodeCredentials(username, password);

        // Initialize JiraClient with Base URL and Auth Header
        JiraClient jiraClient = new JiraClient(baseUrl, authHeader);

        // Initialize IssueOperations with JiraClient
        IssueOperations issueOps = new IssueOperations(jiraClient);

        // Operations on Jira Issues
        try {
            // Create an Issue
            String issueId = issueOps.createIssue("TEST", "Sample Bug", "This is a test bug");
            System.out.println("Created Issue ID: " + issueId);

            // Retrieve the Issue Details
            System.out.println("Issue Details: " + issueOps.getIssue(issueId));

            // Update the Issue Summary
            issueOps.updateIssue(issueId, "Updated Bug Summary");
            System.out.println("Issue summary updated.");

            // Delete the Issue
            issueOps.deleteIssue(issueId);
            System.out.println("Issue deleted successfully.");
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
