package Hometask_Stack_04;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
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
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and process each line of input until EOF
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input));
        }

        scanner.close();
    }
}

