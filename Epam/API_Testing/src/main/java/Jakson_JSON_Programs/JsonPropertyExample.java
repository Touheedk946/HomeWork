package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

class Person2 {
    @JsonProperty("full_name")
    public String name;

    @JsonProperty("age_in_years")
    public int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonPropertyExample {
    public static void main(String[] args) throws Exception {
        Person2 person = new Person2("John", 30);
        ObjectMapper mapper = new ObjectMapper();

        // Serialize object to JSON
        String json = mapper.writeValueAsString(person);
        System.out.println(json); // Output: {"full_name":"John","age_in_years":30}

        // Deserialize JSON to object
        Person deserializedPerson = mapper.readValue(json, Person.class);
        System.out.println(deserializedPerson.name); // Output: John
    }
}

