package SignletonDesign;

public class Logger {
    // Static variable to hold the single instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Private to prevent instantiation
    }

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) { // Lazy initialization
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

