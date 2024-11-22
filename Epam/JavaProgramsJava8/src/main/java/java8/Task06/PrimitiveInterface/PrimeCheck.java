package java8.Task06.PrimitiveInterface;

import java.util.function.IntPredicate;

public class PrimeCheck {
    public static void main(String[] args) {
        IntPredicate isPrime = number -> {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int testNumber = 29;
        System.out.println("Is " + testNumber + " a prime number? " + isPrime.test(testNumber));

        testNumber = 30;
        System.out.println("Is " + testNumber + " a prime number? " + isPrime.test(testNumber));
    }
}
