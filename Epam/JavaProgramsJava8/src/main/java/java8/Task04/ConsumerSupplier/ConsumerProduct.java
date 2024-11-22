package java8.Task04.ConsumerSupplier;

import java8.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerProduct {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 5500, "Electronics", "A"),
                new Product("Mobile", 250, "Electronics", "B"),
                new Product("Refrigerator", 3500, "Appliances", "A"),
                new Product("Television", 300, "Electronics", "A"),
                new Product("WashingMachine", 2000, "Appliances", "B"),
                new Product("Blender", 100, "Appliances", "B"));

        Consumer<List<Product>> filePrinter = getProductPrinter("file");
        filePrinter.accept(products);

        Consumer<List<Product>> consolePrinter = getProductPrinter("console");
        consolePrinter.accept(products);

        Consumer<Product> updatePremium = product -> {
            if (product.getPrice() > 1000) {
                product.setGrade("Premium");
            }
        };
        products.forEach(updatePremium);
        System.out.println("\nList of products after updating the grade to Premium: ");
        products.forEach(System.out::println);

        Consumer<Product> suffixProductName = product -> {
            if (product.getPrice() > 3000) {
                product.setName(product.getName() + "*");
            }
        };
        products.forEach(suffixProductName);
        System.out.println("\nList of products after suffixed with * : ");
        products.forEach(System.out::println);

        Consumer<Product> printIfPremiumMarked = product -> {
            if (product.getGrade().equals("Premium") && product.getName().endsWith("*")) {
                System.out.println(product);
            }
        };
        System.out.println("\nList of Premium grade products with name suffixed with '*': ");
        products.forEach(printIfPremiumMarked);
    }

    public static Consumer<List<Product>> getProductPrinter(String printType) {
        if (printType.equalsIgnoreCase("file")) {
            return ConsumerProduct::printProductsToFile;
        } else {
            return products -> products.forEach(ConsumerProduct::printToConsole);
        }
    }

    private static void printToConsole(Product product) {
        System.out.println(product);
    }

    private static void printProductsToFile(List<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./products.txt"))) {
            for (Product product : products) {
                writer.write(product.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
