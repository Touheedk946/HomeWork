package com.example.jira.operations;

import com.example.jira.client.JiraClient;

public class SearchOperations {

    private final JiraClient jiraClient;

    public SearchOperations(JiraClient jiraClient) {
        this.jiraClient = jiraClient;
    }

    public String searchIssues(String jql) throws Exception {
        String endpoint = "/rest/api/3/search?jql=" + jql;
        return jiraClient.sendGet(endpoint);
    }
}
