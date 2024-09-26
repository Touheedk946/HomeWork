package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

class Product {
    public String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

public class JsonIncludeExample11 {
    public static void main(String[] args) throws Exception {
        Product product = new Product("Laptop", null);
        ObjectMapper mapper = new ObjectMapper();

        // Serialize object to JSON (description will be excluded because it's null)
        String json = mapper.writeValueAsString(product);
        System.out.println(json); // Output: {"name":"Laptop"}
    }
}

