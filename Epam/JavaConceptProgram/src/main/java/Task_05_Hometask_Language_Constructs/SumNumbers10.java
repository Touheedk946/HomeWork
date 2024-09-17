package Task_05_Hometask_Language_Constructs;

public class SumNumbers10 {

    // Method to sum the numbers appearing in the string
    public static int sumNumbers(String str) {
        int sum = 0;
        int currentNumber = 0;
        boolean isNumber = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the current number from consecutive digits
                currentNumber = currentNumber * 10 + (ch - '0');
                isNumber = true;
            } else {
                // If the current character is not a digit and we were processing a number
                if (isNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    isNumber = false;
                }
            }
        }

        // Add the last number if the string ended with digits
        if (isNumber) {
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Task_07_HometaskLoggers.Test cases
        System.out.println(sumNumbers("abc123xyz")); // Output: 123
        System.out.println(sumNumbers("aa11b33"));   // Output: 44
        System.out.println(sumNumbers("7 11"));      // Output: 18
    }
}
