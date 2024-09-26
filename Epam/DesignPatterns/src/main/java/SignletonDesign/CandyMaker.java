package SignletonDesign;

public class CandyMaker {

    // Step 1: Create a private static variable for the single instance
    private static volatile CandyMaker instance;

    private boolean empty;
    private boolean boiled;

    // Step 2: Make the constructor private to prevent instantiation
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    // Step 3: Provide a global access point to get the instance, with thread safety using double-checked locking
    public static CandyMaker getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (CandyMaker.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new CandyMaker();
                }
            }
        }
        return instance;
    }

    // To fill the boiler it must be empty, and once its full,
    // we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and chocolate mix
            System.out.println("Filling the boiler with milk and chocolate mix.");
        }
    }

    // To drain the boiler, it must be full (non-empty) and also boiled.
    // once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            System.out.println("Draining the boiled mixture.");
        }
    }

    // To boil the mixture the boiler has to be full and not already boiled.
    // once it's boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
            System.out.println("Boiling the mixture.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
















/*
Explanation:
Singleton Implementation:

The CandyMaker constructor is made private to prevent direct instantiation.
A private static volatile variable instance is created to hold the single instance of the class.
The getInstance() method provides the global access point to retrieve the singleton instance. It uses double-checked locking to ensure thread safety and minimize synchronization overhead.
Thread Safety:

The getInstance() method first checks if instance is null without locking, to avoid unnecessary synchronization.
If the instance is still null, it synchronizes on the CandyMaker.class object and checks again if the instance is null before creating a new instance. This ensures that only one instance is created even when multiple threads try to access it simultaneously.
Instance Methods:

The fill(), drain(), and boil() methods are used to control the state of the boiler. They ensure that the boiler behaves correctly according to its state (empty, full, boiled).
This solution ensures that only one CandyMaker object is created and accessed throughout the application, even in a multithreaded environment.
 */

