package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String make;
    public String model;

    @JsonCreator
    public Car(@JsonProperty("make") String make, @JsonProperty("model") String model) {
        this.make = make;
        this.model = model;
    }
}

public class JsonCreatorExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"make\":\"Toyota\",\"model\":\"Corolla\"}";
        ObjectMapper mapper = new ObjectMapper();

        // Deserialize JSON to object
        Car car = mapper.readValue(json, Car.class);
        System.out.println(car.make + " " + car.model); // Output: Toyota Corolla
    }
}

