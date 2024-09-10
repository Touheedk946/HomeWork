package Task_05_Hometask_Language_Constructs;

import java.util.Scanner;

public class InOrderCheck {

    // Method to check if the numbers are in order
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        // If bOk is true, we don't care if b is greater than a
        if (bOk) {
            return c > b;  // Only check if c is greater than b
        } else {
            // Otherwise, check if b > a and c > b
            return (b > a && c > b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Read integers a, b, c and boolean bOk
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        System.out.print("Is bOk true or false? ");
        boolean bOk = sc.nextBoolean();

        // Output the result of inOrder method
        boolean result = inOrder(a, b, c, bOk);
        System.out.println("Result: " + result);

        sc.close();
    }
}
