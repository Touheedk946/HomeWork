package org.oops.appliance;

public class TV extends Appliance {

    public TV() {
        super("TV", 1);
    }

    public void switchOn() {
        System.out.println("TV is switched on, consuming " + getPowerConsumption() + " units of power.");
    }
}
