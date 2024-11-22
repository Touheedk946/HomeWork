package java8.Task01.LambdaExpressions;

import java.util.stream.IntStream;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "Madam";

        //check palindrome traditionally
        System.out.println("Is the string \"Madam\" a palindrome (Traditional Method): " + isPalindromeTraditional(str));
        System.out.println("Is the string \"Madam\" a palindrome (with Lambda expression): " + isPalindromeWithLambda(str));
    }

    //// Method to check if a string is a palindrome using lambda expressions
    private static boolean isPalindromeWithLambda(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }
        String finalStr = str.toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome = IntStream.range(0, str.length() / 2).noneMatch(i -> finalStr.charAt(i) != finalStr.charAt(finalStr.length() - i - 1));
        return isPalindrome;
    }

    // Method to check if a string is a palindrome using a traditional approach
    private static boolean isPalindromeTraditional(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }
        String finalStr = str.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = finalStr.length() - 1;

        while (left < right){
            if(finalStr.charAt(left) != finalStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
