package org.PizzaShop;


public class Pizza {
    private String TypeOFPizza;
    private double cost;

    public Pizza(String name, double cost) {
        this.TypeOFPizza = name;
        this.cost = cost;
    }
    public String getName() {
        return TypeOFPizza;
    }
    public double getCost() {
        return cost;
    }
}