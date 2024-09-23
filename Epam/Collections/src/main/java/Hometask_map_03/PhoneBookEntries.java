package Hometask_map_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookEntries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries
        System.out.println("Enter the number of phone book entries:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline after integer input

        // Create a map to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Read the entries and populate the map
        System.out.println("Enter the name and phone number for each entry:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Read and process queries
        System.out.println("Enter names to query the phonebook (type 'exit' to quit):");
        while (true) {
            String query = scanner.nextLine();
            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
