package org.appliance;


public abstract class Appliance {

    private String name;
    private int powerConsumption; // Power consumption in units

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void switchOn();


    public String toString() {
        return name + " (" + powerConsumption + " units)";
    }
}
