
package confectionery;

import java.util.Scanner;

public class Temp_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of chocolates you want to add:");
        int chocolateSize = sc.nextInt();

        System.out.println("Enter the number of sweets you want to add:");
        int sweetSize = sc.nextInt();

        Gift gift = new Gift(chocolateSize, sweetSize);

        // Adding Chocolates
        for (int i = 0; i < chocolateSize; i++) {
            System.out.println("Enter chocolate name:");
            sc.nextLine(); // consume newline
            String chocolateName = sc.nextLine();

            System.out.println("Enter chocolate weight:");
            double chocolateWeight = sc.nextDouble();

            System.out.println("Enter chocolate type:");
            sc.nextLine(); // consume newline
            String chocolateType = sc.nextLine();

            gift.addChocolate(new Chocolate(chocolateName, chocolateWeight, chocolateType));
        }

        // Adding Sweets
        for (int i = 0; i < sweetSize; i++) {
            System.out.println("Enter sweet name:");
            sc.nextLine(); // consume newline
            String sweetName = sc.nextLine();

            System.out.println("Enter sweet weight:");
            double sweetWeight = sc.nextDouble();

            System.out.println("Enter sweet type:");
            sc.nextLine(); // consume newline
            String sweetType = sc.nextLine();

            gift.addSweet(new Sweet(sweetName, sweetWeight, sweetType));
        }

        // Display total weight of gift
        System.out.println("Total weight of the gift: " + gift.totalWeightCalculate() + " grams");

        // Sorting and displaying chocolates by weight
        System.out.println("Sorting chocolates by weight:");
        gift.sortChocolatesBasedOnWeight();
        for (Chocolate choco : gift.getChocolates()) {
            if (choco != null) {
                System.out.println(choco.getName() + ": " + choco.getWeight() + " grams");
            }
        }

        // Finding chocolates in a weight range
        System.out.println("Enter minimum weight of chocolates to find:");
        double minWeight = sc.nextDouble();

        System.out.println("Enter maximum weight of chocolates to find:");
        double maxWeight = sc.nextDouble();

        System.out.println("Finding chocolates between " + minWeight + " and " + maxWeight + " grams:");
        Chocolate[] rangeCountsOfChocolateDetails = gift.chocolatesWeightRange(minWeight, maxWeight);
        for (Chocolate choco : rangeCountsOfChocolateDetails) {
            System.out.println(choco.getName() + ": " + choco.getWeight() + " grams");
        }

        sc.close();
    }
}
