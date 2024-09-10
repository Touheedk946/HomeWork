package org.oops.bouquet;

abstract class Flower {
    private String name;
    private double cost;

    public Flower(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

}
