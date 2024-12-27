package com.example.jira.tests;

import com.example.jira.service.JiraService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JiraApiTests {

    private final JiraService jiraService = new JiraService();

    @Test(dataProvider = "issueIds")
    public void testUnarchiveIssue(String issueId) {
        Response response = jiraService.unarchiveIssue(issueId);
        Assert.assertEquals(response.statusCode(), 204, "Unarchiving issue failed.");
    }

    @Test(dataProvider = "issueIds")
    public void testGetIssue(String issueId) {
        Response response = jiraService.getIssue(issueId);
        Assert.assertEquals(response.statusCode(), 200, "Fetching issue failed.");
    }

    @DataProvider(name = "issueIds")
    public Object[][] issueIds() {
        return new Object[][]{
                {"TEST-1"},
                {"TEST-2"}
        };
    }
}
