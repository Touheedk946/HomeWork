package com.example.jira.client;

import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JiraClient {
    private final String baseUrl;
    private final String authHeader;

    // Constructor accepts pre-encoded authHeader for better flexibility
    public JiraClient(String baseUrl, String authHeader) {
        this.baseUrl = baseUrl;
        this.authHeader = authHeader;
    }

    // Generic method for HTTP POST
    public String sendPost(String endpoint, String jsonPayload) throws Exception {
        HttpPost post = new HttpPost(baseUrl + endpoint);
        post.setHeader("Authorization", authHeader);
        post.setHeader("Content-Type", "application/json");
        post.setEntity(new StringEntity(jsonPayload));

        return sendRequest(post);
    }

    // Generic method for HTTP GET
    public String sendGet(String endpoint) throws Exception {
        HttpGet get = new HttpGet(baseUrl + endpoint);
        get.setHeader("Authorization", authHeader);
        get.setHeader("Content-Type", "application/json");

        return sendRequest(get);
    }

    // Generic method for HTTP PUT
    public String sendPut(String endpoint, String jsonPayload) throws Exception {
        HttpPut put = new HttpPut(baseUrl + endpoint);
        put.setHeader("Authorization", authHeader);
        put.setHeader("Content-Type", "application/json");
        put.setEntity(new StringEntity(jsonPayload));

        return sendRequest(put);
    }

    // Generic method for HTTP DELETE
    public String sendDelete(String endpoint) throws Exception {
        HttpDelete delete = new HttpDelete(baseUrl + endpoint);
        delete.setHeader("Authorization", authHeader);

        return sendRequest(delete);
    }

    // Private method to handle request execution
    private String sendRequest(HttpRequestBase request) throws Exception {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {
            String responseString = EntityUtils.toString(response.getEntity());
            System.out.println("Response Status: " + response.getStatusLine());
            if (response.getStatusLine().getStatusCode() >= 400) {
                throw new Exception("Error in API response: " + responseString);
            }
            return responseString;
        }
    }
}
