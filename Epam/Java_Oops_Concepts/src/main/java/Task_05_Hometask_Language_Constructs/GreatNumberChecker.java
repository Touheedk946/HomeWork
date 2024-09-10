package Task_05_Hometask_Language_Constructs;

public class GreatNumberChecker {
    private int a;
    private int b;

    // Constructor to initialize the integers
    public GreatNumberChecker(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to check if either number is 6 or if their sum or difference is 6
    public boolean isGreatNumber() {
        // Check if either number is 6
        if (a == 6 || b == 6) {
            return true;
        }

        // Check if the sum or difference is 6
        int sum = a + b;
        int difference = Math.abs(a - b);

        return (sum == 6 || difference == 6);
    }

    public static void main(String[] args) {
        // Example usage
        GreatNumberChecker checker1 = new GreatNumberChecker(4, 2);
        System.out.println("Result for (4, 2): " + checker1.isGreatNumber());

        GreatNumberChecker checker2 = new GreatNumberChecker(6, 2);
        System.out.println("Result for (6, 2): " + checker2.isGreatNumber());

        GreatNumberChecker checker3 = new GreatNumberChecker(3, 9);
        System.out.println("Result for (3, 9): " + checker3.isGreatNumber());

        GreatNumberChecker checker4 = new GreatNumberChecker(3, 3);
        System.out.println("Result for (3, 3): " + checker4.isGreatNumber());
    }
}
