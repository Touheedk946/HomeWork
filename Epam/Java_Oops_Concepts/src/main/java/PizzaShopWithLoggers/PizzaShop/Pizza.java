package PizzaShopWithLoggers.PizzaShop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pizza {
    private static final Logger logger = LogManager.getLogger(Pizza.class);

    private String typeOFPizza;
    private double cost;

    public Pizza(String name, double cost) {
        this.typeOFPizza = name;
        this.cost = cost;
        logger.info("Pizza created: " + name + " costing: ₹" + cost);
    }

    public String getName() {
        logger.debug("Accessing pizza name: " + typeOFPizza);
        return typeOFPizza;
    }

    public double getCost() {
        logger.debug("Accessing pizza cost: ₹" + cost);
        return cost;
    }
}
