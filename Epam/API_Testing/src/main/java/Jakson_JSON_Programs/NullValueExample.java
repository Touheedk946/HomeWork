package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

class Person1 {
    public String name;

    @JsonInclude(JsonInclude.Include.ALWAYS)
    public String email;

    public Person1(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

public class NullValueExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Include null values
        Person1 person = new Person1("John", null);
        String json = mapper.writeValueAsString(person);
        System.out.println(json); // Output: {"name":"John","email":null}
    }
}
