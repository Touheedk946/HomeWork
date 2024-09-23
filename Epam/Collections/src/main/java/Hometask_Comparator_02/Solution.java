package Hometask_Comparator_02;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Player[] players = new Player[n];

        System.out.println("Enter player name and score:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int score = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            players[i] = new Player(name, score);
        }

        // Create a Checker instance
        Checker checker = new Checker();

        // Sort the players array using the checker comparator
        Arrays.sort(players, checker);

        // Print the sorted players
        System.out.println("Sorted players:");
        for (Player player : players) {
            System.out.println(player);
        }

        scanner.close();
    }
}
