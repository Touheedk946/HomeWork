package JavaSimple.TakeInputFromCommandLIne;

public class Calculator {
    public static void main(String[] args) {
        // Taking input from CommandLine
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <number 1> <operation> <number 2>");
            System.out.println("Operations: +, -, *, /, %, percentage");
            return;
        }

        double a = Double.parseDouble(args[0]);  // First number
        String operation = args[1];              // Operation symbol
        double b = Double.parseDouble(args[2]);  // Second number

        double result = 0;
        boolean isValid = true;

        // Perform the operation based on the symbol
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
                    System.out.println("Error: Cannot divide by zero.");
                    isValid = false;
                }
                break;
            case "%": // Modulus (remainder) calculation
                result = a % b;
                break;
            case "percentage": // Calculate percentage
                result = (a * b) / 100;
                break;
            default:
                System.out.println("Error: Unsupported operation. Use +, -, *, /, %, or 'percentage'.");
                isValid = false;
        }

        // If the operation is valid, print the result
        if (isValid) {
            System.out.println("Result: " + result);
        }
    }
}
