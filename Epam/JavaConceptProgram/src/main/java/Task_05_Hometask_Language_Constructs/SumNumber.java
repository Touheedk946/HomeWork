package Task_05_Hometask_Language_Constructs;

public class SumNumber {
    private String str;

    // Constructor to initialize the string
    public SumNumber(String str) {
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
        SumNumber example1 = new SumNumber("abc123xyz");
        System.out.println(example1.getSumOfNumbers());  // Output: 123

        SumNumber example2 = new SumNumber("aa11b33");
        System.out.println(example2.getSumOfNumbers());  // Output: 44

        SumNumber example3 = new SumNumber("7 11");
        System.out.println(example3.getSumOfNumbers());  // Output: 18
    }
}

