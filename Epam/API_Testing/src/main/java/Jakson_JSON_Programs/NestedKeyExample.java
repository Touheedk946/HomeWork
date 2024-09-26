package Jakson_JSON_Programs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NestedKeyExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"John\", \"address\":{\"city\":\"New York\", \"zip\":\"10001\"}}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);

        // Find nested value for key "city"
        JsonNode cityNode = rootNode.findValue("city");
        System.out.println(cityNode.asText()); // Output: New York
    }
}

