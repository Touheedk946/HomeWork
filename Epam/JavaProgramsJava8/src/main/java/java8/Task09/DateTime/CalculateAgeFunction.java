package java8.Task09.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/* *
 * Write a Function to calculate the age of a person given date of birth.
* */
public class CalculateAgeFunction {
    public static void main(String[] args) {
        Function<LocalDate, Integer> calculateAge = (dateOfBirth) -> {
          LocalDate currentDate = LocalDate.now();
            return Period.between(dateOfBirth, currentDate).getYears();
        };

        LocalDate dateOfBirth = LocalDate.of(1991, 11, 13);
        int age = calculateAge.apply(dateOfBirth);
        System.out.println("Age is: " + age);
    }
}
