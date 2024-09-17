package Task_07_HometaskLoggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingLevelsExample2 {

    private static final Logger logger = LogManager.getLogger(LoggingLevelsExample2.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE level message.");
        logger.debug("This is a DEBUG level message.");
        logger.info("This is an INFO level message.");
        logger.warn("This is a WARN level message.");
        logger.error("This is an ERROR level message.");
        logger.fatal("This is a FATAL level message.");

        performOperation(10, 5);
        performOperation(10, 0); // This will log an error
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
