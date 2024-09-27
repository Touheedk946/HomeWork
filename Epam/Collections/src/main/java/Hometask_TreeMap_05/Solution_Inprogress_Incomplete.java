package Hometask_TreeMap_05;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution_Inprogress_Incomplete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline

        while (T-- > 0) {
            System.out.println("Enter the number of queries:");
            int Q = scanner.nextInt(); // Number of queries
            scanner.nextLine(); // Consume newline

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            for (int i = 0; i < Q; i++) {
                System.out.println("Enter query:");
                String query = scanner.next();

                switch (query) {
                    case "a": // Add key-value pair
                        int keyToAdd = scanner.nextInt();
                        int valueToAdd = scanner.nextInt();
                        treeMap.put(keyToAdd, valueToAdd);
                        break;

                    case "b": // Query value for a key
                        int keyToQuery = scanner.nextInt();
                        System.out.print(treeMap.getOrDefault(keyToQuery, -1) + " ");
                        break;

                    case "c": // Query size of the TreeMap
                        System.out.print(treeMap.size() + " ");
                        break;

                    case "d": // Remove key
                        int keyToRemove = scanner.nextInt();
                        treeMap.remove(keyToRemove);
                        break;

                    case "e": // Print all keys
                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                            System.out.print(entry.getKey() + " ");
                        }
                        System.out.print(" "); // Add a space after the keys
                        break;

                    default:
                        System.out.println("Invalid query");
                        break;
                }
            }
            System.out.println(); // Newline for the next test case
        }

        scanner.close();
    }
}
