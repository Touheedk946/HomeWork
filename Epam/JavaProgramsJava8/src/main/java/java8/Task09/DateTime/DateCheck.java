package java8.Task09.DateTime;

import java.time.LocalDate;
import java.util.function.Predicate;

/*
 * Write a predicate to check if the given date is yesterday date.
 */
public class DateCheck {
    public static void main(String[] args) {
        //Predicate to test if a date is yesterday
        Predicate<LocalDate> isYesterday = date -> date.equals(LocalDate.now().minusDays(1));

        System.out.println("Current Date: " + LocalDate.now());

        //Example date to test
        LocalDate localDate = LocalDate.now().minusDays(1);
        //Testing the Predicate
        System.out.println("Is the test date " + localDate + " yesterday?: " + isYesterday.test(localDate));

        // Testing with another date (not yesterday)
        LocalDate notYesterdayDate = LocalDate.now().minusDays(2);
        System.out.println("Is the test date " + notYesterdayDate + " yesterday? " + isYesterday.test(notYesterdayDate));
    }
}
