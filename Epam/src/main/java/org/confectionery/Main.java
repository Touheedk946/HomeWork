package org.confectionery;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift(5, 5);

        gift.addChocolate(new Chocolate("Dark Chocolate", 50,  "Dark"));
        gift.addChocolate(new Chocolate("Milk Chocolate", 30,  "Milk"));
        gift.addChocolate(new Chocolate("White Chocolate", 40,  "White"));

        gift.addSweet(new Sweet("Fruity Candy", 15,  "Fruity"));
        gift.addSweet(new Sweet("Minty Candy", 20,  "Minty"));

        System.out.println("Total weight of the gift: " + gift.totalWeightCalculate() + " grams");

        System.out.println("Sorting chocolates by weight:");
        gift.sortChocolatesBasedOnWeight();
        for (Chocolate choco : gift.getChocolates()) {
            if (choco != null) {
                System.out.println(choco.getName() + ": " + choco.getWeight() + " grams");
            }
        }

        System.out.println("Finding chocolates between 35 and 50 grams:");
        Chocolate[] rangeCountsOfChocolateDetails = gift.chocolatesWeightRange(35, 50);
        for (Chocolate choco : rangeCountsOfChocolateDetails) {
            System.out.println(choco.getName() + ": " + choco.getWeight() + " grams");
        }
    }
}
