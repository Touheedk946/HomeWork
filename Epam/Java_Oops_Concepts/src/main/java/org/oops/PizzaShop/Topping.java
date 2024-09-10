package org.oops.PizzaShop;


public class Topping {
    private String toppingName;
    private double cost;

    public Topping(String name, double cost) {
        this.toppingName = name;
        this.cost = cost;
    }

    public String getName() {
        return toppingName;
    }

    public double getCost() {
        return cost;
    }
}