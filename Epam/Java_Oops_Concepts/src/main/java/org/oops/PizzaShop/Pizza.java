package org.oops.PizzaShop;


public class Pizza {
    private String typeOFPizza;
    private double cost;

    public Pizza(String name, double cost) {
        this.typeOFPizza = name;
        this.cost = cost;
    }
    public String getName() {
        return typeOFPizza;
    }
    public double getCost() {
        return cost;
    }
}