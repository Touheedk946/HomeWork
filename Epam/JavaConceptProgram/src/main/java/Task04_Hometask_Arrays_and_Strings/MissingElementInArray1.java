package Task04_Hometask_Arrays_and_Strings;

public class MissingElementInArray1 {
    public static void main(String[] args) {
        int n = 100;
        int[] numbers = new int[n - 1];

        // Fill the array, skipping a specific number (15)
        int missing = 15;
        for (int i = 1, j = 0; i <= n; i++) {
            if (i != missing) {
                numbers[j++] = i;
            }
        }

        // Find the missing number
        int missingNumber = findMissingNumber(numbers, n);

        // Print the result
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int n) {
        int xorArray = 0;
        int xorRange = 0;

        // XOR all elements in the array
        for (int num : arr) {
            xorArray ^= num;    // 0^1 to all
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorRange ^= i;
        }

        // The missing number is the XOR of xorArray and xorRange
        return xorArray ^ xorRange;
    }
}
