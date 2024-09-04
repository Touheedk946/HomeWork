import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please Enter Two Numbers for Calculation");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Please Enter Calculation Symbol (+, -, *, /, %, percentage) to Add addition, subtraction, multiplication and division");
        String operation = sc.next();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;

            case "%": // Remainder calculation
            System.out.print("Enter the second number: ");
            double num2Rem = sc.nextDouble();
            result = a % num2Rem;
            break;
            case "percentage": // Percentage calculation
                System.out.print("Enter the [percentage] Number to calculate Percentage of First Value (without % sign): ");
                double percentage = sc.nextDouble();
                result = (a * percentage) / 100;
                break;
            default:
                System.out.println("Error: Invalid operation. Use +, -, *, or /.");
                validOperation = false;
        }

        // Check the operation symbol is valid or not and print result if valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
