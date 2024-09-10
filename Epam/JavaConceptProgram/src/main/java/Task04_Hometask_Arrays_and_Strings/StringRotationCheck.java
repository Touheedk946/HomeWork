package Task04_Hometask_Arrays_and_Strings;

import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine(); //erbottlewat

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine(); //waterbottle

        // Check if the strings are rotations of each other
        if (areRotations(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }

        sc.close();
    }

    private static boolean areRotations(String str1, String str2) {
        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}

