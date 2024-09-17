package Task_07_HometaskLoggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleLoggerExample1 {

    private static final Logger logger = LogManager.getLogger(SimpleLoggerExample1.class);

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.debug("This is a debug message.");
        logger.error("This is an error message.");

        performCalculation(10, 0);
    }

    public static void performCalculation(int a, int b) {
        try {
            int result = a / b;
            logger.info("Result of division: {}", result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred: Division by zero", e);
        }
    }
}
