package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee {
    public String name;

    @JsonIgnore
    public String password; // This field will be ignored

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class JsonIgnoreExample {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee("Alice", "secret123");
        ObjectMapper mapper = new ObjectMapper();

        // Serialize object to JSON (password will be ignored)
        String json = mapper.writeValueAsString(employee);
        System.out.println(json); // Output: {"name":"Alice"}
    }
}
