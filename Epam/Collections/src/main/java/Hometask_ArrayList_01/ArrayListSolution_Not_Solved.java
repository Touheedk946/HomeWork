package Hometask_ArrayList_01;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution_Not_Solved {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of lines (n)
        System.out.print("Enter the number of lines (n): ");
        int n = scanner.nextInt();
        System.out.println("You entered: " + n + " lines");

        // Step 2: Create an ArrayList of ArrayLists to store the numbers in each line
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        System.out.println("Reading the lines and storing them in a list of lists...");

        // Step 3: Read each line and store the numbers in the list of lists
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of integers in line " + (i + 1) + ": ");
            int d = scanner.nextInt(); // number of integers on this line
            System.out.println("Number of integers to read: " + d);

            // Create a new list to store the numbers of the current line
            ArrayList<Integer> line = new ArrayList<>();

            System.out.print("Enter " + d + " integers for line " + (i + 1) + ": ");
            for (int j = 0; j < d; j++) {
                int value = scanner.nextInt(); // read the next integer
                line.add(value); // add the integer to the current line
            }
            System.out.println("Line " + (i + 1) + " read successfully: " + line);
            listOfLists.add(line); // add this line to the list of lists
        }

        System.out.println("All lines read successfully: " + listOfLists);

        // Step 4: Read the number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();
        System.out.println("You entered: " + q + " queries");

        // Step 5: Process each query
        for (int i = 0; i < q; i++) {
            System.out.print("Enter the line number (x) and position in the line (y) for query " + (i + 1) + ": ");
            int x = scanner.nextInt(); // line number
            int y = scanner.nextInt(); // position in the line
            System.out.println("Query " + (i + 1) + " - Line number: " + x + ", Position in line: " + y);

            // Check if the line number x and position y exist
            if (x <= listOfLists.size() && y <= listOfLists.get(x - 1).size()) {
                System.out.println("Result for query " + (i + 1) + ": " + listOfLists.get(x - 1).get(y - 1));
            } else {
                System.out.println("Result for query " + (i + 1) + ": ERROR! Line or position out of bounds");
            }
        }

        // Close the scanner object to avoid memory leaks
        scanner.close();
        System.out.println("All queries processed successfully!");
    }
}
