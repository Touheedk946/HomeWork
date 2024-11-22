package java8.Task05.BiFunctionalInterfaces;

import java8.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ProductFactory {
    public static void main(String[] args) {
        BiFunction<String, Double, Product> productCreator = (name, price) -> {
            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            return product;
        };

        Product productSpeakers = productCreator.apply("Speakers", 88.88);
        System.out.println(productSpeakers);

        Map<Product, Integer> cart = new HashMap<>();
        cart.put(productCreator.apply("Laptop", 1200.00), 2);
        cart.put(productCreator.apply("Keyboard", 400.00), 2);
        cart.put(productCreator.apply("Mouse", 300.00), 1);
        cart.put(productCreator.apply("HeadPhones", 350.00), 3);

        BiFunction<Product, Integer, Double> calculateTotalCost = (product, quantity) -> product.getPrice() * quantity;

        double totalCartCost = cart.entrySet().stream()
                .mapToDouble(entry -> calculateTotalCost.apply(entry.getKey(), entry.getValue()))
                .sum();

        System.out.println("Total cart Cost: $" + totalCartCost);
    }
}
