package Hometask_ArrayList_01;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListSolution_Not_Solved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = scanner.nextInt();

        // Create an ArrayList of ArrayLists to store the numbers in each line
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        // Reading the lines
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // number of integers on this line
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt()); // add integers to the line
            }
            listOfLists.add(line); // add this line to the list of lists
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); // line number
            int y = scanner.nextInt(); // position in the line

            // Check if the line x exists and the position y exists in that line
            if (x <= listOfLists.size() && y <= listOfLists.get(x - 1).size()) {
                System.out.println(listOfLists.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}