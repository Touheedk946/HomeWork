package Task_07_HometaskLoggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileLoggingExample3 {

    private static final Logger logger = LogManager.getLogger(FileLoggingExample3.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        performOperation(10, 5);
        performOperation(10, 0);  // This will log an error

        logger.info("Application finished.");
    }

    public static void performOperation(int a, int b) {
        logger.debug("Performing operation: {} / {}", a, b);
        try {
            int result = a / b;
            logger.info("Result of operation: {}", result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred: Division by zero", e);
        }
    }
}
