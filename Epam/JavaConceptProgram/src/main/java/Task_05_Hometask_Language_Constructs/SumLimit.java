package Task_05_Hometask_Language_Constructs;

public class SumLimit {
    private int a;
    private int b;

    // Constructor to initialize the values of a and b
    public SumLimit(int a, int b) {
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
        SumLimit example1 = new SumLimit(2, 3);
        System.out.println(example1.calculateSumLimit());  // Output: 5

        SumLimit example2 = new SumLimit(8, 3);
        System.out.println(example2.calculateSumLimit());  // Output: 8

        SumLimit example3 = new SumLimit(8, 1);
        System.out.println(example3.calculateSumLimit());  // Output: 9
    }
}
