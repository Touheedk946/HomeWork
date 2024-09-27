package Hometask_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution_To_Find_Line_And_Index_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inform the user about the program's functionality
        System.out.println("Welcome! This program allows you to input multiple lines of numbers and then query specific numbers based on line and position.");
        System.out.println("Follow the prompts to input your data and run the queries.");

        // Step 1: Read the number of lines to input
        System.out.print("Enter the number of lines you want to input: ");
        int n = scanner.nextInt();  // Read the number of lines

        // Create an ArrayList of ArrayLists to store the numbers in each line
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        System.out.println("Please enter " + n + " lines of numbers:");

        // Step 2: Read each line and the numbers in it
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of integers in line " + (i + 1) + ": ");
            int d = scanner.nextInt(); // Read the number of integers on this line

            // Create a new list for this line
            ArrayList<Integer> line = new ArrayList<>();

            System.out.print("Enter " + d + " integers separated by spaces: ");
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt()); // Add each integer to the line
            }
            listOfLists.add(line); // Add this line to the list of lists
        }

        // Step 3: Read the number of queries
        System.out.print("Enter the number of queries you want to make: ");
        int q = scanner.nextInt();

        System.out.println("Please enter your queries as pairs of numbers representing line number and position:");

        // Step 4: Process each query
        for (int i = 0; i < q; i++) {
            System.out.print("Query " + (i + 1) + " - Enter line number and position (e.g., 1 3): ");
            int x = scanner.nextInt(); // Read the line number
            int y = scanner.nextInt(); // Read the position in the line

            // Step 5: Check if the line number and position are within bounds
            if (x > 0 && x <= listOfLists.size() && y > 0 && y <= listOfLists.get(x - 1).size()) {
                // Valid line and position, print the value at that position
                System.out.println("The value at line " + x + ", position " + y + " is: " + listOfLists.get(x - 1).get(y - 1));
            } else {
                // Invalid line or position, print an error message
                System.out.println("ERROR! The specified line or position is out of bounds.");
            }
        }

        // Step 6: Close the scanner
        scanner.close();
    }
}
