package FirstProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAppOutput() {
        System.out.println("Epam ");
        String expectedOutput = "Hello, Gradle!";
        String actualOutput = App.getMessage(); // Create a static method getMessage() in App.java that returns "Hello, Gradle!"
        assertEquals(expectedOutput, actualOutput);
    }
}
