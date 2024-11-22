package java8;

public class Response {
    private final String responseBody;
    private final int statusCode;
    private final String responseType;

    public Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseType() {
        return responseType;
    }
}
