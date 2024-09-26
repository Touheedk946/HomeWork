package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

class Event2 {
    public String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date eventDate;

    public Event2(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }
}

public class JsonFormatExample {
    public static void main(String[] args) throws Exception {
        Event2 event = new Event2("Meeting", new Date());
        ObjectMapper mapper = new ObjectMapper();

        // Serialize object to JSON
        String json = mapper.writeValueAsString(event);
        System.out.println(json); // Output: {"name":"Meeting","eventDate":"2024-09-24"}
    }
}

