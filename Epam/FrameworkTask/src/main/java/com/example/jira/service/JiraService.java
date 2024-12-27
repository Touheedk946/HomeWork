package com.example.jira.service;

import com.example.jira.config.ConfigManager;
import com.example.jira.utils.HttpUtils;
import io.restassured.response.Response;

public class JiraService {

    private final String baseUrl = ConfigManager.getBaseUrl();
    private final String authToken = ConfigManager.getAuthToken();

    public Response unarchiveIssue(String issueId) {
        String url = baseUrl + "/rest/api/3/issue/" + issueId + "/unarchive";
        return HttpUtils.sendPut(url, authToken, "{}");
    }

    public Response getIssue(String issueId) {
        String url = baseUrl + "/rest/api/3/issue/" + issueId;
        return HttpUtils.sendGet(url, authToken);
    }
}
