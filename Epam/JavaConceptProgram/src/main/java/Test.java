import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        // Logging messages at different levels
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
        logger.fatal("This is a FATAL message");

        // Log information about the logger's configuration
        displayLoggerProperties();
    }

    // Method to display some logger properties
    public static void displayLoggerProperties() {
        System.out.println("\nLogger Properties:");
        System.out.println("Logger Name: " + logger.getName());
        System.out.println("Logger Level: " + logger.getLevel());
        //System.out.println("Logger Additivity: " + logger.isAdditive());
    }
}
