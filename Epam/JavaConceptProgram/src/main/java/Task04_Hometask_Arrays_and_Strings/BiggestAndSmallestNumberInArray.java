package Task04_Hometask_Arrays_and_Strings;

import java.util.Scanner;

public class BiggestAndSmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array from User
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array
        int[] numbers = new int[n];

        // Input: elements of the array as per declaration of size of array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize the biggest and smallest numbers
        int biggest = numbers[0];
        int smallest = numbers[0];

        // Traverse the array to find biggest and smallest numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Output: biggest and smallest numbers
        System.out.println("Biggest number in the array: " + biggest);
        System.out.println("Smallest number in the array: " + smallest);

        sc.close();
    }
}
