package java8.Task02.Predicates;

import java8.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductFilter {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 5500, "Electronics", "A"),
                new Product("Mobile", 250, "Electronics", "B"),
                new Product("Refrigerator", 1500, "Appliances", "A"),
                new Product("Television", 300, "Electronics", "B"),
                new Product("WashingMachine", 2000, "Appliances", "C"),
                new Product("Blender", 100, "Appliances", "B"));

        Predicate<Product> isPriceAbove1000 = product -> product.getPrice() > 1000;
        Predicate<Product> isElectronics = product -> product.getCategory().equals("Electronics");

        List<Product> productsWithPriceAbove1000 = products.stream().filter(isPriceAbove1000).toList();
        System.out.println("Products with prices above 1000: ");
        printProducts(productsWithPriceAbove1000);

        List<Product> electronicProducts = products.stream().filter(isElectronics).toList();
        System.out.println("\nProducts with category Electronics: ");
        printProducts(electronicProducts);

        List<Product> productsWithPriceAbove1000AndElectronics = products.stream().filter(isPriceAbove1000.and(isElectronics)).toList();
        System.out.println("\nProducts with price above 1000 and category Electronics: ");
        printProducts(productsWithPriceAbove1000AndElectronics);

        List<Product> productsWithPriceAbove1000OrElectronics = products.stream().filter(isPriceAbove1000.or(isElectronics)).toList();
        System.out.println("\nProducts with price above 1000 or category Electronics: ");
        printProducts(productsWithPriceAbove1000OrElectronics);

        List<Product> productsWithPriceBelow1000AndElectronics = products.stream().filter(isPriceAbove1000.negate().and(isElectronics)).toList();
        System.out.println("\nProducts with Price below 1000 and category Electronics: ");
        printProducts(productsWithPriceBelow1000AndElectronics);
    }

    private static void printProducts(List<Product> filteredProducts) {
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }
}
