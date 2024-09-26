package Jakson_JSON_Programs;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
    public String name;
    private int grade;

    public int getGrade() {
        return grade;
    }

    @JsonSetter("studentGrade")
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class JsonSetterExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"John\",\"studentGrade\":10}";
        ObjectMapper mapper = new ObjectMapper();

        // Deserialize JSON to object
        Student student = mapper.readValue(json, Student.class);
        System.out.println(student.getGrade()); // Output: 10
    }
}
