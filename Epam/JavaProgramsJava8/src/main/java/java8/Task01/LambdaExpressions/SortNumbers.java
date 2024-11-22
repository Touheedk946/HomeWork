package java8.Task01.LambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 6);

        Comparator<Integer> reverseOrder = (a, b) -> b.compareTo(a);

        numbers.sort(reverseOrder);

        System.out.println("Sorted list in reverse order: " + numbers);
    }
}
