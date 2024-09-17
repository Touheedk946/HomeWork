package Hometask_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of lines
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Step 2: Read each line
        for (int i = 0; i < n; i++) {
            int count = scanner.nextInt();  // Number of integers in this line
            ArrayList<Integer> innerList = new ArrayList<>();

            // Add the integers to the inner list
            for (int j = 0; j < count; j++) {
                innerList.add(scanner.nextInt());
            }

            // Add the inner list to the main list
            list.add(innerList);
        }

        // Step 3: Read the number of queries
        int q = scanner.nextInt();

        // Step 4: Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();  // Line number
            int y = scanner.nextInt();  // Position within the line

            // Check if the line number and position are valid
            if (x <= list.size() && x > 0 && y <= list.get(x - 1).size() && y > 0) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}

