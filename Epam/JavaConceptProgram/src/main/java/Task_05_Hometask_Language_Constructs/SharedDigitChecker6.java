package Task_05_Hometask_Language_Constructs;
import java.util.Scanner;

public class SharedDigitChecker6 {

    // Method to check if two numbers share any digits
    public static boolean shareDigit(int num1, int num2) {
        // Get digits of num1
        int num1Left = num1 / 10;   // Left digit of num1
        int num1Right = num1 % 10;  // Right digit of num1

        // Get digits of num2
        int num2Left = num2 / 10;   // Left digit of num2
        int num2Right = num2 % 10;  // Right digit of num2

        // Check if any digit from num1 matches any digit from num2
        return (num1Left == num2Left || num1Left == num2Right ||
                num1Right == num2Left || num1Right == num2Right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number (10 to 99): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number (10 to 99): ");
        int num2 = scanner.nextInt();

        // Call the shareDigit method and print result
        boolean result = shareDigit(num1, num2);
        System.out.println("Do the numbers share a digit? " + result);

        scanner.close();
    }
}
