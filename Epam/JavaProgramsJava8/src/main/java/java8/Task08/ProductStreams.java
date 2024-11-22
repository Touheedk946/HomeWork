package java8.Task08;

import java8.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductStreams {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 5500, "Electronics", "A"),
                new Product("Mobile", 250, "Electronics", "B"),
                new Product("Refrigerator", 1500, "Appliances", "A"),
                new Product("Television", 3000, "Electronics", "A"),
                new Product("WashingMachine", 2000, "Appliances", "B"),
                new Product("Blender", 100, "Appliances", "B"));

        Predicate<Product> isPriceAbove1000 = product -> product.getPrice() > 1000;
        Predicate<Product> isElectronics = product -> product.getCategory().equals("Electronics");

        List<Product> productsAbove1000 = products.stream().filter(isPriceAbove1000).toList();
        System.out.println("List of products whose price is above 1000: ");
        productsAbove1000.forEach(System.out::println);

        List<Product> electronicProducts = products.stream().filter(isElectronics).toList();
        System.out.println("\nList of Electronic Products: ");
        electronicProducts.forEach(System.out::println);

        List<Product> filteredProducts = products.stream().filter(isElectronics.and(isPriceAbove1000))
                .peek(product -> product.setName(product.getName().toUpperCase())).toList();
        System.out.println("\nList of products whose price is above 1000 and belongs to Electronics category.");
        System.out.println("And also updated product names to uppercase.");
        filteredProducts.forEach(System.out::println);

        long countOfElectronicProducts = products.stream().filter(isElectronics).count();
        System.out.println("\nCount of Electronic Products: " + countOfElectronicProducts);
    }
}
