package java8.Task06.PrimitiveInterface;

import java.util.function.IntConsumer;

public class SquarePrinter {
    public static void main(String[] args) {
        IntConsumer printSquare = number -> {
            int square = number * number;
            System.out.println("The square of the " + number + " is: " + square);
        };

        printSquare.accept(4);
        printSquare.accept(25);
        printSquare.accept(45);
    }
}
