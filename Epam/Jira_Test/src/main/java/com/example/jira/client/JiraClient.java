package com.example.jira.client;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpHeaders;

public class JiraClient {

    private final String baseUrl;
    private final String authHeader;

    public JiraClient(String baseUrl, String authHeader) {
        this.baseUrl = baseUrl;
        this.authHeader = authHeader;
    }

    public String sendPost(String endpoint, String jsonPayload) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(baseUrl + endpoint);
            post.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
            post.setHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(jsonPayload));
            return EntityUtils.toString(client.execute(post).getEntity());
        }
    }

    public void sendPut(String endpoint, String jsonPayload) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPut put = new HttpPut(baseUrl + endpoint);
            put.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
            put.setHeader("Content-Type", "application/json");
            put.setEntity(new StringEntity(jsonPayload));
            client.execute(put);
        }
    }

    public String sendGet(String endpoint) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet get = new HttpGet(baseUrl + endpoint);
            get.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
            return EntityUtils.toString(client.execute(get).getEntity());
        }
    }

    public void sendDelete(String endpoint) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpDelete delete = new HttpDelete(baseUrl + endpoint);
            delete.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
            client.execute(delete);
        }
    }
}
