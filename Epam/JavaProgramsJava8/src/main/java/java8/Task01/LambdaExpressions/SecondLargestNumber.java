package java8.Task01.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 7, 23, 56, 89, 34);
        findSecondLargest(numbers);
        findSecondLargestUsingLambdaExpr(numbers);
    }

    private static void findSecondLargestUsingLambdaExpr(List<Integer> numbers) {
        Optional<Integer> secondLargest = numbers.stream()
                .sorted((a, b) -> b.compareTo(a)) //sort in descending order
                .skip(1) // skip the largest number
                .findFirst(); //get the second-largest number
        if(secondLargest.isPresent()){
            System.out.println("Second largest number using lambda expression and streams: " + secondLargest.get());
        }else {
            System.out.println("List is empty or has only one element.");
        }
    }

    private static void findSecondLargest(List<Integer> numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        if(secondLargest != Integer.MIN_VALUE){
            System.out.println("Second Largest Number: " + secondLargest);
        }
        else {
            System.out.println("List is empty or has only one element.");
        }
    }
}
