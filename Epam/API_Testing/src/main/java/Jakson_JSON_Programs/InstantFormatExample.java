package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Instant;

class Event {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    public Instant timestamp;

    public Event(Instant timestamp) {
        this.timestamp = timestamp;
    }
}

public class InstantFormatExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Event event = new Event(Instant.now());
        String json = mapper.writeValueAsString(event);
        System.out.println(json);  // Output: {"timestamp":"2023-09-23T13:10:22Z"}
    }
}

