package Jakson_JSON_Programs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JsonNodeToCollectionExample {
    public static void main(String[] args) throws Exception {
        String json = "[\"apple\", \"banana\", \"orange\"]";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json);

        // Convert JsonNode to List of Strings
        List<String> fruits = mapper.convertValue(jsonNode, List.class);
        System.out.println(fruits); // Output: [apple, banana, orange]
    }
}

