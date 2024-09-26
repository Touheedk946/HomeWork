package Jakson_JSON_Programs;

import com.fasterxml.jackson.databind.ObjectMapper;

class Person {
    public String name;
    public String email;
}

public class ForceTypeExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"John\",\"email\":\"touheedk946@gmail.com\"}";
        ObjectMapper mapper = new ObjectMapper();

        // Deserialize JSON into Person class
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person.name);
        System.out.println(person.email);// Output: John
    }
}

