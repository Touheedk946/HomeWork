package Hometask_TreeMap_05;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline

        while (T-- > 0) {
            int Q = scanner.nextInt(); // Number of queries
            scanner.nextLine(); // Consume newline

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            for (int i = 0; i < Q; i++) {
                String query = scanner.next();

                switch (query) {
                    case "a":
                        int keyToAdd = scanner.nextInt();
                        int valueToAdd = scanner.nextInt();
                        treeMap.put(keyToAdd, valueToAdd);
                        break;

                    case "b":
                        int keyToQuery = scanner.nextInt();
                        System.out.print(treeMap.getOrDefault(keyToQuery, -1) + " ");
                        break;

                    case "c":
                        System.out.print(treeMap.size() + " ");
                        break;

                    case "d":
                        int keyToRemove = scanner.nextInt();
                        treeMap.remove(keyToRemove);
                        break;

                    case "e":
                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                            System.out.print(entry.getKey() + " ");
                        }
                        System.out.print(" ");
                        break;
                }
            }
            System.out.println(); // Newline for the next test case
        }

        scanner.close();
    }
}

