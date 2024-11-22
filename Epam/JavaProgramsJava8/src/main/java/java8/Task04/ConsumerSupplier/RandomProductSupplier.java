package java8.Task04.ConsumerSupplier;

import java8.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.function.Supplier;

public class RandomProductSupplier {
    public static void main(String[] args) {
        Supplier<Product> randomProductSupplier = () -> {
            Random random = new Random();

            String[] names = {"Laptop", "Gaming PC", "SmartPhone", "WashingMachine", "Refrigerator", "Television"};
            String[] categories = {"Electronics", "Appliances", "Computers"};
            String[] grades = {"Standard", "Premium", "Economy"};

            int nameIndex = random.nextInt(names.length);
            int categoryIndex = random.nextInt(categories.length);
            int gradeIndex = random.nextInt(grades.length);

            double randomPrice = 100 + (5000 - 100) * random.nextDouble();
            BigDecimal price = new BigDecimal(randomPrice).setScale(2, RoundingMode.HALF_DOWN);

            return new Product(names[nameIndex], price.doubleValue(), categories[categoryIndex], grades[gradeIndex]);
        };

        Product randomProduct = randomProductSupplier.get();
        System.out.println("Random product generated through RandomProductSupplier: ");
        System.out.println(randomProduct);
    }
}
