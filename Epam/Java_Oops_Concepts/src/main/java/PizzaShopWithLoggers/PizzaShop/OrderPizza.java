package PizzaShopWithLoggers.PizzaShop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OrderPizza {
    private static final Logger logger = LogManager.getLogger(OrderPizza.class);

    private Pizza base;
    private List<Topping> toppings;

    public OrderPizza(Pizza base) {
        this.base = base;
        this.toppings = new ArrayList<>();
        logger.info("Order created with base: " + base.getName() + " costing: ₹" + base.getCost());
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        logger.info("Added topping: " + topping.getName() + " costing: ₹" + topping.getCost());
    }

    public double calculateTotalCost() {
        double totalCost = base.getCost();
        logger.debug("Starting total cost calculation with base cost: ₹" + totalCost);

        for (Topping topping : toppings) {
            totalCost += topping.getCost();
            logger.debug("Added topping cost: ₹" + topping.getCost() + ", updated total: ₹" + totalCost);
        }

        logger.info("Final total cost calculated: ₹" + totalCost);
        return totalCost;
    }

    public void displayOrder() {
        logger.info("Displaying order details");
        System.out.println("Pizza with " + base.getName() + " base:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getName());
            logger.debug("Displaying topping: " + topping.getName());
        }

        System.out.println("Total cost: ₹" + calculateTotalCost());
        logger.info("Order displayed successfully");
    }
}
