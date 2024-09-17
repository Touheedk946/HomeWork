package Task_05_Hometask_Language_Constructs;

public class SumLimit7 {
    private int a;
    private int b;

    // Constructor to initialize the values of a and b
    public SumLimit7(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to calculate the sum limit as per the problem
    public int calculateSumLimit() {
        // Calculate the sum of a and b
        int sum = this.a + this.b;

        // Check the number of digits in a and sum
        int aDigits = String.valueOf(this.a).length();
        int sumDigits = String.valueOf(sum).length();

        // If the sum has the same number of digits as a, return the sum
        // Otherwise, return a
        if (sumDigits == aDigits) {
            return sum;
        } else {
            return this.a;
        }
    }

    public static void main(String[] args) {
        // Create objects and test the sumLimit function
        SumLimit7 example1 = new SumLimit7(2, 3);
        System.out.println(example1.calculateSumLimit());  // Output: 5

        SumLimit7 example2 = new SumLimit7(8, 3);
        System.out.println(example2.calculateSumLimit());  // Output: 8

        SumLimit7 example3 = new SumLimit7(8, 1);
        System.out.println(example3.calculateSumLimit());  // Output: 9
    }

    public static class SumNumber10 {
        private String str;

        // Constructor to initialize the string
        public SumNumber10(String str) {
            this.str = str;
        }

        // Method to calculate the sum of numbers appearing in the string
        public int getSumOfNumbers() {
            int sum = 0;  // To store the sum of numbers
            String temp = "";  // Temporary string to build a number from consecutive digits

            // Loop through each character of the string
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // If the character is a digit, add it to the temporary string
                if (Character.isDigit(currentChar)) {
                    temp += currentChar;
                } else {
                    // If temp has some digits, convert it to an integer and add to sum
                    if (!temp.isEmpty()) {
                        sum += Integer.parseInt(temp);
                        temp = "";  // Reset temp after adding the number to sum
                    }
                }
            }

            // After the loop, check if there's any remaining number in temp
            if (!temp.isEmpty()) {
                sum += Integer.parseInt(temp);
            }

            return sum;
        }

        public static void main(String[] args) {
            // Create objects and test the sumNumbers function
            SumNumber10 example1 = new SumNumber10("abc123xyz");
            System.out.println(example1.getSumOfNumbers());  // Output: 123

            SumNumber10 example2 = new SumNumber10("aa11b33");
            System.out.println(example2.getSumOfNumbers());  // Output: 44

            SumNumber10 example3 = new SumNumber10("7 11");
            System.out.println(example3.getSumOfNumbers());  // Output: 18
        }
    }
}
