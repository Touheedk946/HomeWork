package Task01_HomeTask_Webservices_Functional;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class CalculatorWebServiceTest {

    private static final String BASE_URL = "http://www.dneonline.com/calculator.asmx";

    public static void main(String[] args) {
        testAdd();
        testSubtract();
        testMultiply();
        testDivide();
    }

    private static void testAdd() {
        System.out.println("Testing Add Method:");
        String requestPayload = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>"
                + "<Add xmlns=\"http://www.dneonline.com/calculator/\">"
                + "<intA>5</intA>"
                + "<intB>3</intB>"
                + "</Add>"
                + "</soap:Body>"
                + "</soap:Envelope>";
        sendRequest("Add", requestPayload);
    }

    private static void testSubtract() {
        System.out.println("Testing Subtract Method:");
        String requestPayload = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>"
                + "<Subtract xmlns=\"http://www.dneonline.com/calculator/\">"
                + "<intA>10</intA>"
                + "<intB>4</intB>"
                + "</Subtract>"
                + "</soap:Body>"
                + "</soap:Envelope>";
        sendRequest("Subtract", requestPayload);
    }

    private static void testMultiply() {
        System.out.println("Testing Multiply Method:");
        String requestPayload = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>"
                + "<Multiply xmlns=\"http://www.dneonline.com/calculator/\">"
                + "<intA>3</intA>"
                + "<intB>7</intB>"
                + "</Multiply>"
                + "</soap:Body>"
                + "</soap:Envelope>";
        sendRequest("Multiply", requestPayload);
    }

    private static void testDivide() {
        System.out.println("Testing Divide Method:");
        String requestPayload = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                + "<soap:Body>"
                + "<Divide xmlns=\"http://www.dneonline.com/calculator/\">"
                + "<intA>10</intA>"
                + "<intB>0</intB>" // Test with 0 for division
                + "</Divide>"
                + "</soap:Body>"
                + "</soap:Envelope>";
        sendRequest("Divide", requestPayload);
    }

    private static void sendRequest(String methodName, String requestPayload) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost postRequest = new HttpPost(BASE_URL + "/" + methodName);
            postRequest.setHeader("Content-Type", "text/xml; charset=utf-8");
            postRequest.setEntity(new StringEntity(requestPayload));

            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                String responseString = EntityUtils.toString(response.getEntity());
                System.out.println("Response for " + methodName + ":\n" + responseString);
            }
        } catch (Exception e) {
            System.err.println("Error during " + methodName + " request: " + e.getMessage());
        }
    }
}

