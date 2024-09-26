package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties({"age", "address"}) // Ignore these fields
class User {
    public String name;
    public int age;
    public String address;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

public class JsonIgnorePropertiesExample {
    public static void main(String[] args) throws Exception {
        User user = new User("Bob", 40, "123 Street");
        ObjectMapper mapper = new ObjectMapper();

        // Serialize object to JSON (age and address will be ignored)
        String json = mapper.writeValueAsString(user);
        System.out.println(json); // Output: {"name":"Bob"}
    }
}

