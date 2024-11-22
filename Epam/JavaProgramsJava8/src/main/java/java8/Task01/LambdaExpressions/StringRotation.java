package java8.Task01.LambdaExpressions;

import java.util.function.BiPredicate;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";

        isRotationTraditional(str1, str2);
        isRotationUsingLambdaExpr(str1, str2);
    }

    private static void isRotationUsingLambdaExpr(String str1, String str2) {
        System.out.println("\nVerification of rotations of strings using lambda expression.");
        BiPredicate<String, String> isRotation = (s1, s2) -> s1.length() == s2.length() && (s1 + s1).contains(s2);

        if(isRotation.test(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are rotations of each other.");
        }else {
            System.out.println(str1 + " and " + str2 + "are not rotations of each other.");
        }
    }

    private static void isRotationTraditional(String str1, String str2) {
        System.out.println("Verification of rotations of string using traditional approach.");
        if( str1.length() != str2.length()){
                System.out.println(str1 + " and " + str2 + " are not rotations of each other.");
            }

            String concantenatedString = str1 + str1;
            boolean isRotation = concantenatedString.contains(str2);

            if(isRotation){
                System.out.println(str1 + " and " + str2 + " are rotations of each other.");
            }else {
                System.out.println(str1 + " and " + str2 + "are not rotations of each other.");
            }
    }
}
