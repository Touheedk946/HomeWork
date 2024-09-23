package Hometask_Stack_04;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBrances {
    // Function to check if the string is balanced
    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                // Ignore other characters
                default:
                    break;
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings to check for balanced parentheses (type 'exit' to quit):");

        // Read and process each line of input until "exit" is entered
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Is balanced: " + isBalanced(input));
        }

        scanner.close();
    }
}
