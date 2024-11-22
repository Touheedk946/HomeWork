package java8.Task03.FunctionalInterface;

import java8.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class ProductCalculator {

    static ToDoubleFunction<Product> priceExtractor = Product::getPrice;
    static Predicate<Product> isPriceAbove1000 = product -> product.getPrice() > 1000;
    static Predicate<Product> isElectronics = product -> product.getCategory().equals("Electronics");

    //Function to calculate the total cost of all products
    public static double calculateTotalCost(List<Product> products) {
        return products.stream().mapToDouble(priceExtractor).sum();
    }

    //Function to calculate the total cost of products with a price greater than 1000
    public static double calculateTotalCostAboveThreshold(List<Product> products) {
        return products.stream().filter(isPriceAbove1000).mapToDouble(priceExtractor).sum();
    }

    //Function to calculate the cost of all electronic products in the given list of products
    public static double calculateTotalCostOfElectronicProducts(List<Product> products) {
        return products.stream().filter(isElectronics).mapToDouble(priceExtractor).sum();
    }

    //Function to get all the products whose price is >1000 and belongs to electronic category
    public static List<Product> getAllElectronicProductsAbove1000(List<Product> products) {
        return products.stream().filter(isPriceAbove1000.and(isElectronics)).toList();
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 5500, "Electronics", "A"),
                new Product("Mobile", 250, "Electronics", "B"),
                new Product("Refrigerator", 1500, "Appliances", "A"),
                new Product("Television", 300, "Electronics", "A"),
                new Product("WashingMachine", 2000, "Appliances", "B"),
                new Product("Blender", 100, "Appliances", "B"));

        double totalCost = calculateTotalCost(products);
        System.out.println("Total cost of all products: " + totalCost);

        System.out.println("\nTotal cost of all products whose price is above 1000: " +
                calculateTotalCostAboveThreshold(products));

        System.out.println("\nTotal cost of all products whose category is Electronics: " +
                calculateTotalCostOfElectronicProducts(products));

        System.out.println("\nElectronic products whose price is above 1000: ");
        List<Product> electronicProductsAbove1000 = getAllElectronicProductsAbove1000(products);
        for (Product product : electronicProductsAbove1000) {
            System.out.println(product);
        }
    }
}
