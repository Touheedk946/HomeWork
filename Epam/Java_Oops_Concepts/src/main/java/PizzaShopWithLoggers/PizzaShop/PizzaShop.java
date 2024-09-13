package PizzaShopWithLoggers.PizzaShop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception for invalid choices
class InvalidPizzaSelectionException extends Exception {
    public InvalidPizzaSelectionException(String message) {
        super(message);
    }
}

public class PizzaShop {
    private static final Logger logger = LogManager.getLogger(PizzaShop.class);

    public static void main(String[] args) {
        logger.info("Pizza Shop application started");
        Scanner sc = new Scanner(System.in);

        // Create pizza bases
        Pizza standardBase = new Pizza("Standard", 100);
        Pizza softBase = new Pizza("Soft Base", 120);

        // Create toppings
        Topping tomato = new Topping("Tomato", 20);
        Topping corn = new Topping("Corn", 25);
        Topping mushrooms = new Topping("Mushrooms", 30);
        Topping onion = new Topping("Onions", 60);

        logger.debug("Initialized pizza bases and toppings");

        // Available pizza bases and toppings
        System.out.println("Welcome to Pizza Shop!");
        Pizza chosenBase = null;

        // Base selection with exception handling
        while (chosenBase == null) {
            System.out.println("Available Pizza Bases:");
            System.out.println("1. Standard Base (₹100)");
            System.out.println("2. Soft Base (₹120)");
            System.out.print("Choose your base (1 or 2): ");

            try {
                int baseChoice = sc.nextInt();
                sc.nextLine(); // Consume newline

                chosenBase = selectBase(baseChoice, standardBase, softBase);
                logger.info("User selected base: " + chosenBase.getName());
            } catch (InvalidPizzaSelectionException e) {
                logger.warn("Invalid base choice made by the user", e);
                System.out.println(e.getMessage()); // Display the error message
            } catch (InputMismatchException e) {
                logger.error("Invalid input type detected", e);
                System.out.println("Invalid input type! Please enter a number.");
                sc.nextLine(); // Clear the invalid input
            }
        }

        // Create order with chosen base
        OrderPizza userPizza = new OrderPizza(chosenBase);

        // Toppings selection
        System.out.println("\nAvailable Toppings:");
        System.out.println("1. Tomato (₹20)");
        System.out.println("2. Corn (₹25)");
        System.out.println("3. Mushrooms (₹30)");
        System.out.println("4. Onions (₹60)");
        System.out.println("Enter the numbers of the toppings you want (separated by spaces), or type '0' to finish:");

        while (true) {
            try {
                int toppingChoice = sc.nextInt();
                sc.nextLine(); // Consume newline
                if (toppingChoice == 0) {
                    break;
                }

                addToppingToPizza(toppingChoice, userPizza, tomato, corn, mushrooms, onion);
                logger.info("User selected topping: " + toppingChoice);
            } catch (InvalidPizzaSelectionException e) {
                logger.warn("Invalid topping choice made by the user", e);
                System.out.println(e.getMessage()); // Display the error message for invalid topping
            } catch (InputMismatchException e) {
                logger.error("Invalid input type detected for topping", e);
                System.out.println("Invalid input type! Please enter a number.");
                sc.nextLine(); // Clear invalid input
            }
        }

        // Display order
        userPizza.displayOrder();
        logger.info("Order displayed successfully");

        // Close scanner to prevent resource leak
        sc.close();
        logger.info("Pizza Shop application ended");
    }

    // Method to select base with exception handling
    public static Pizza selectBase(int baseChoice, Pizza standardBase, Pizza softBase) throws InvalidPizzaSelectionException {
        logger.debug("User selecting base: " + baseChoice);
        switch (baseChoice) {
            case 1:
                return standardBase;
            case 2:
                return softBase;
            default:
                throw new InvalidPizzaSelectionException("Invalid base choice. Please select 1 or 2.");
        }
    }

    // Method to add toppings with exception handling
    public static void addToppingToPizza(int toppingChoice, OrderPizza userPizza, Topping tomato, Topping corn, Topping mushrooms, Topping onion) throws InvalidPizzaSelectionException {
        logger.debug("User selecting topping: " + toppingChoice);
        switch (toppingChoice) {
            case 1:
                userPizza.addTopping(tomato);
                break;
            case 2:
                userPizza.addTopping(corn);
                break;
            case 3:
                userPizza.addTopping(mushrooms);
                break;
            case 4:
                userPizza.addTopping(onion);
                break;
            default:
                throw new InvalidPizzaSelectionException("Invalid topping choice. Please select a valid option.");
        }
    }
}
