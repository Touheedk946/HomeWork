package java8.Task06.PrimitiveInterface;

import java.util.Random;
import java.util.function.IntSupplier;

public class RandomIntSupplier {
    public static void main(String[] args) {
        Random random = new Random();

        IntSupplier randomNumberBelow5000 = () -> random.nextInt(5000);

        System.out.println("Random Numbers below 5000: ");
        System.out.println(randomNumberBelow5000.getAsInt());
        System.out.println(randomNumberBelow5000.getAsInt());
        System.out.println(randomNumberBelow5000.getAsInt());
    }
}
