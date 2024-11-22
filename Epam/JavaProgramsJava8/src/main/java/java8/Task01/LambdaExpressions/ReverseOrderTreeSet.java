package java8.Task01.LambdaExpressions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ReverseOrderTreeSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 2, 9, 1, 4, 7, 6);

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(numbers);

        System.out.println("Sorted TreeSet in reverse order: " + treeSet);
    }
}
