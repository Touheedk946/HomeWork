package PizzaShopWithLoggers.PizzaShop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Topping {
    private static final Logger logger = LogManager.getLogger(Topping.class);

    private String toppingName;
    private double cost;

    public Topping(String name, double cost) {
        this.toppingName = name;
        this.cost = cost;
        logger.info("Topping created: " + name + " costing: ₹" + cost);
    }

    public String getName() {
        logger.debug("Accessing topping name: " + toppingName);
        return toppingName;
    }

    public double getCost() {
        logger.debug("Accessing topping cost: ₹" + cost);
        return cost;
    }
}
