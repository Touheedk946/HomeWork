package RestApis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Create a User object
        User user = new User();
        user.setId(1);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        try {
            // Serialization: Java object to JSON
            String userJson = objectMapper.writeValueAsString(user);
            System.out.println("Serialized JSON: " + userJson);

            // Deserialization: JSON to Java object
            String json = "{\"id\":2,\"name\":\"Jane Doe\",\"email\":\"jane.doe@example.com\"}";
            User deserializedUser = objectMapper.readValue(json, User.class);
            System.out.println("Deserialized User: " + deserializedUser.getName());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

