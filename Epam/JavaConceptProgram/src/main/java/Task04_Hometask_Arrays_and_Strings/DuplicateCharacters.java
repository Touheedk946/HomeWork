package Task04_Hometask_Arrays_and_Strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Convert the string to lowercase to ensure case-insensitivity
        inputString = inputString.toLowerCase();

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the string and count character occurrences
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Ignore spaces
            if (currentChar == ' ') {
                continue;
            }

            // Update the count of each character in the HashMap
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch) + " times");
            }
        }

        sc.close();
    }
}
