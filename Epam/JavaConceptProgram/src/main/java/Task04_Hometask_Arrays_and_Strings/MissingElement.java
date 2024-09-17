package Task04_Hometask_Arrays_and_Strings;

public class MissingElement {
    public static void main(String[] args) {
        // Example array with one missing element (1 to 100)
        int[] arr = new int[99];  // Array of size 99 (one element missing)

        // Fill the array with numbers from 1 to 100, skipping one number
        int missingNumber = 57; // Let's say 57 is missing
        for (int i = 0, j = 1; i < arr.length; j++) {
            if (j != missingNumber) {
                arr[i] = j;
                i++;
            }
        }

        // Step 1: Calculate the sum of the first 100 natural numbers
        int n = 100;
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the sum of the elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Step 3: Find the missing number
        int missingElement = expectedSum - actualSum;

        // Output the missing number
        System.out.println("The missing number is: " + missingElement);
    }
}

