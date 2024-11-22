package java8.Task01.LambdaExpressions;

import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMapDescendingOrder {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(10, "Ten");
        treeMap.put(40, "Forty");
        treeMap.put(80, "Eighty");
        treeMap.put(20, "Twenty");
        treeMap.put(50, "Fifty");

        System.out.println("TreeMap values in descending order: " + treeMap);

    }
}
