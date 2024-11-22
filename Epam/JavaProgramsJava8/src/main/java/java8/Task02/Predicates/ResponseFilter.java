package java8.Task02.Predicates;

import java8.Response;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ResponseFilter {
    public static void main(String[] args) {
        List<Response> responses = Arrays.asList(
                new Response("Response 1", 200, "JSON"),
                new Response("Response 2", 200, "XML"),
                new Response("Response 3", 300, "JSON"),
                new Response("Response 4", 400, "JSON"),
                new Response("Response 5", 400, "XML"));

        Predicate<Response> isStatusCode400 = response -> response.getStatusCode() == 400;

        List<Response> responsesWith400StatusCode = responses.stream().filter(isStatusCode400).toList();
        System.out.println("Responses with Status Code 400: ");
        printResponses(responsesWith400StatusCode);

        Predicate<Response> isResponseTypeJSON = response -> response.getResponseType().equals("JSON");

        List<Response> responsesWithResponseTypeJSON = responses.stream().filter(isResponseTypeJSON).toList();
        System.out.println("\nResponses with Response Type JSON: ");
        printResponses(responsesWithResponseTypeJSON);

        List<Response> resWithStatusCode400AndResTypeJSON = responses.stream().filter(isStatusCode400.and(isResponseTypeJSON)).toList();
        System.out.println("\nResponses with Status Code 400 and Response Type JSON: ");
        printResponses(resWithStatusCode400AndResTypeJSON);

        List<Response> resWithStatusCode400OrResTypeJSON = responses.stream().filter(isStatusCode400.or(isResponseTypeJSON)).toList();
        System.out.println("\nResponses with Status Code 400 or Response Type JSON: ");
        printResponses(resWithStatusCode400OrResTypeJSON);

        List<Response> resWithStatusCodeNot400AndResTypeJSON = responses.stream().filter(isStatusCode400.negate().and(isResponseTypeJSON)).toList();
        System.out.println("\nResponses with status code is not 400 and response type JSON: ");
        printResponses(resWithStatusCodeNot400AndResTypeJSON);
    }

    private static void printResponses(List<Response> responsesWith400StatusCode) {
        for (Response response : responsesWith400StatusCode){
            System.out.println(response.getResponseBody());
        }
    }
}
