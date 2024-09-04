package org.appliance;

public class Main {
    public static void main(String[] args) {
        // Create An Object of Home Class to Pass Size of Appliances And Add those by Object home
        Home home = new Home(4);

        home.addAppliance(new Fan());
        home.addAppliance(new Light());
        home.addAppliance(new TV());
        home.addAppliance(new Laptop());

        System.out.println("Before sorting Calculated Current Load: " + home.calculateCurrentLoad() + " units\n");

        System.out.println("Appliances before sorting:");
        home.showAppliances();

        home.sortAppliancesByPowerConsumption();

        System.out.println("\nAppliances after sorting by power consumption:");
        home.showAppliances();

        System.out.println("\nSwitching on all appliances:");
        home.switchOnAllAppliances();

        System.out.println("\nTotal power consumption after sorting: " + home.calculateCurrentLoad() + " units");
    }
}
