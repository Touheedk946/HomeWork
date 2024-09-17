package Task_07_HometaskLoggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;  // For adding user-specific info

public class UserSpecificLogging {

    private static final Logger logger = LogManager.getLogger(UserSpecificLogging.class);

    public static void main(String[] args) {
        // Log actions for User 1
        ThreadContext.put("userId", "User1");
        logger.info("Starting the process.");
        performAction("Login");
        performAction("Update profile");

        // Clear the user context
        ThreadContext.clearMap();

        // Log actions for User 2
        ThreadContext.put("userId", "User2");
        logger.info("Starting another process.");
        performAction("Add new product");

        // Clear the user context
        ThreadContext.clearMap();

        logger.info("Application finished.");
    }

    private static void performAction(String action) {
        logger.info("Performing action: " + action);
        // Simulate an action, e.g., a successful update or error handling
        if ("Update profile".equals(action)) {
            logger.warn("Profile update took longer than expected.");
        }
    }
}

