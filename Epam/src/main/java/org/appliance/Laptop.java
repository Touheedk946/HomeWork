package org.appliance;

public class Laptop extends Appliance {

    public Laptop() {
        super("Laptop", 4);
    }


    public void switchOn() {
        System.out.println("Laptop is switched on, consuming " + getPowerConsumption() + " units of power.");
    }
}