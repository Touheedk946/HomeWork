package java8.Task09.DateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Supplier;

/*
 * Write a Supplier to get CurrentTime in EST timezone
 */
public class CurrentTimeESTSupplier {
    public static void main(String[] args) {
        Supplier<LocalTime> currentTimeInEST = () -> {
            ZoneId estZoneId = ZoneId.of("America/New_York");
            ZonedDateTime estTime = ZonedDateTime.now(estZoneId);
            return estTime.toLocalTime();
        };

        // Fetch and print the current time in EST using the supplier
        LocalTime currentTimeEST = currentTimeInEST.get();
        System.out.println("Current Time in EST: " + currentTimeEST);
    }
}
