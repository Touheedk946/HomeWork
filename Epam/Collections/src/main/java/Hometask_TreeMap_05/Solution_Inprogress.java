package Hometask_TreeMap_05;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution_Inprogress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! This program processes multiple test cases with various queries on a TreeMap.");

        // Step 1: Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline

        // Process each test case
        while (T-- > 0) {
            System.out.println("\nProcessing a new test case...");

            // Step 2: Read the number of queries for the current test case
            System.out.print("Enter the number of queries for this test case: ");
            int Q = scanner.nextInt(); // Number of queries
            scanner.nextLine(); // Consume newline

            // Create a TreeMap to store key-value pairs
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            System.out.println("Now enter your queries. Format: ");
            System.out.println(" - 'a <key> <value>' to add or update key-value pair");
            System.out.println(" - 'b <key>' to query the value for a given key");
            System.out.println(" - 'c' to get the size of the TreeMap");
            System.out.println(" - 'd <key>' to remove a key");
            System.out.println(" - 'e' to print all keys in the TreeMap");

            // Step 3: Process each query
            for (int i = 0; i < Q; i++) {
                System.out.print("Enter query " + (i + 1) + ": ");
                String query = scanner.next(); // Read the query type

                switch (query) {
                    case "a": // Add or update key-value pair
                        int keyToAdd = scanner.nextInt();
                        int valueToAdd = scanner.nextInt();
                        treeMap.put(keyToAdd, valueToAdd);
                        System.out.println("Added/Updated key " + keyToAdd + " with value " + valueToAdd);
                        break;

                    case "b": // Query value for a key
                        int keyToQuery = scanner.nextInt();
                        int queriedValue = treeMap.getOrDefault(keyToQuery, -1);
                        System.out.print(queriedValue + " ");
                        System.out.println("(Queried value for key " + keyToQuery + " is: " + queriedValue + ")");
                        break;

                    case "c": // Query size of the TreeMap
                        int size = treeMap.size();
                        System.out.print(size + " ");
                        System.out.println("(Size of the TreeMap is: " + size + ")");
                        break;

                    case "d": // Remove a key
                        int keyToRemove = scanner.nextInt();
                        if (treeMap.containsKey(keyToRemove)) {
                            treeMap.remove(keyToRemove);
                            System.out.println("Removed key " + keyToRemove);
                        } else {
                            System.out.println("Key " + keyToRemove + " not found in the TreeMap.");
                        }
                        break;

                    case "e": // Print all keys in the TreeMap
                        System.out.print("Current keys in the TreeMap: ");
                        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                            System.out.print(entry.getKey() + " ");
                        }
                        System.out.print(" "); // Add a space after the keys
                        System.out.println("(Printed all keys in the TreeMap)");
                        break;

                    default:
                        System.out.println("Invalid query. Please try again.");
                        break;
                }
            }
            System.out.println("\nEnd of test case.\n"); // Newline for the next test case
        }

        // Close the scanner
        scanner.close();
        System.out.println("All test cases processed. Program terminated.");
    }
}
