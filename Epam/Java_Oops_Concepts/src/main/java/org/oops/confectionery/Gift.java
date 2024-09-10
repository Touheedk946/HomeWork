package org.oops.confectionery;

import java.util.Arrays;

public class Gift {
    private Chocolate[] chocolates;
    private Sweet[] sweets;
    private int chocolateCount;
    private int sweetCount;

    public Gift(int chocolateSize, int sweetSize) {
        chocolates = new Chocolate[chocolateSize];
        sweets = new Sweet[sweetSize];
        chocolateCount = 0;
        sweetCount = 0;
    }

    public void addChocolate(Chocolate chocolate) {
        if (chocolateCount < chocolates.length) {
            chocolates[chocolateCount++] = chocolate;
        }
    }

    public void addSweet(Sweet sweet) {
        if (sweetCount < sweets.length) {
            sweets[sweetCount++] = sweet;
        }
    }

    public double totalWeightCalculate() {
        double totalWeight = 0.0;
        for (int i = 0; i < chocolateCount; i++) {
            totalWeight += chocolates[i].getWeight();
        }
        for (int i = 0; i < sweetCount; i++) {
            totalWeight += sweets[i].getWeight();
        }
        return totalWeight;
    }

    // Sorting chocolates using Comparator
    public void sortChocolatesBasedOnWeight() {
        Arrays.sort(chocolates, 0, chocolateCount, new ChocolateWeightComparator());
    }


    public Chocolate[] chocolatesWeightRange(double minWeight, double maxWeight) {
        return Arrays.stream(chocolates, 0, chocolateCount)
                .filter(chocolate -> chocolate.getWeight() >= minWeight && chocolate.getWeight() <= maxWeight)
                .toArray(Chocolate[]::new);
    }


    public Chocolate[] getChocolates() {
        return chocolates;
    }

    public Sweet[] getSweets() {
        return sweets;
    }
}
