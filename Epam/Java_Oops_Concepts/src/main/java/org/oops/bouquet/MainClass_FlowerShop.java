package org.oops.bouquet;

public class MainClass_FlowerShop {
    public static void main(String[] args) {
        // Create a bouquet
        Bouquet myBouquet = new Bouquet();

        // Add different flowers to the bouquet
        myBouquet.addFlower(new Rose());
        myBouquet.addFlower(new Jasmine());
        myBouquet.addFlower(new Lily());

        // Display the bouquet details and total cost
        myBouquet.displayBouquet();
    }
}
