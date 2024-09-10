package org.oops.confectionery;

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

    public void sortChocolatesBasedOnWeight() {
        //comparator
        for (int i = 0; i < chocolateCount - 1; i++) {
            for (int j = 0; j < chocolateCount - i - 1; j++) {
                if (chocolates[j].getWeight() > chocolates[j + 1].getWeight()) {
                    Chocolate temp = chocolates[j];
                    chocolates[j] = chocolates[j + 1];
                    chocolates[j + 1] = temp;
                }
            }
        }
    }


    public Chocolate[] chocolatesWeightRange(double minWeight, double maxWeight) {

        int count = 0;
        // First loop to count matching chocolates
        for (int i = 0; i < chocolateCount; i++) {
            if (chocolates[i].getWeight() >= minWeight && chocolates[i].getWeight() <= maxWeight) {
                count++;
            }
        }

        Chocolate[] result = new Chocolate[count];
        int index = 0;

        // Second loop to populate the result array with matching chocolates
        for (int i = 0; i < chocolateCount; i++) {
            if (chocolates[i].getWeight() >= minWeight && chocolates[i].getWeight() <= maxWeight) {
                result[index++] = chocolates[i];
            }
        }

        return result;  // Return the correctly sized array
    }


    public Chocolate[] getChocolates() {
        return chocolates;
    }

    public Sweet[] getSweets() {
        return sweets;
    }
}
