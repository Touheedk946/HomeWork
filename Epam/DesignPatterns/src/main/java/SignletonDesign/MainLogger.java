package SignletonDesign;
public class MainLogger {
    public static void main(String[] args) {
        // Trying to create multiple Logger instances
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if logger1 and logger2 are the same
        System.out.println(logger1 == logger2); // Output: true

        // Use the logger to log messages
        logger1.log("Singleton pattern example: Logger initialized.");
        logger2.log("This message is logged using the same Logger instance.");
    }
}
