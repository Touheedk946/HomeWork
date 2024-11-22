package java8.Task09.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

/*
* Write a Supplier to get Date for next Thursday.
 */
public class NextThursdaySupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> nextThursdaySupplier = () -> {
            LocalDate today = LocalDate.now();
            LocalDate nextThursday = today;
            while (nextThursday.getDayOfWeek() != DayOfWeek.THURSDAY){
                nextThursday = nextThursday.plusDays(1);
            }
            if(nextThursday.isBefore(today)){
                nextThursday =nextThursday.plusWeeks(1);
            }
            return nextThursday;
        };

        LocalDate nextThursdayDate = nextThursdaySupplier.get();
        System.out.println("Next Thursday is: " + nextThursdayDate);

    }
}
