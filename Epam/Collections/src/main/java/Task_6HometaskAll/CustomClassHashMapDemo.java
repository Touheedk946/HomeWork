package Task_6HometaskAll;

import java.util.HashMap;
import java.util.Map;

public class CustomClassHashMapDemo {
    public static void main(String[] args) {
        // HashMap with custom class objects
        Map<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student("Alice", 1), "A");
        studentMap.put(new Student("Bob", 2), "B");
        studentMap.put(new Student("Charlie", 3), "C");

        // Iterate and print the studentMap
        for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
