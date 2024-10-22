package Hometask_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of lines
        int n = scanner.nextInt();

        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        // Read each line and store numbers
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // number of integers on this line
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt()); // read the next integer
            }
            listOfLists.add(line);
        }

        // Read number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); // line number
            int y = scanner.nextInt(); // position in the line

            // Check if line number and position exist
            if (x <= listOfLists.size() && y <= listOfLists.get(x - 1).size()) {
                // Print the element found at the position
                System.out.println(listOfLists.get(x - 1).get(y - 1));
            } else {
                // Print error message if the position is invalid
                System.out.println("ERROR!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
