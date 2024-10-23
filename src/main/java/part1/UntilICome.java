package part1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class UntilICome {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        LocalDate targetDate = LocalDate.of(2023, Month.APRIL, 21);
//
//        long days = ChronoUnit.DAYS.between(today, targetDate);
//        long hours = ChronoUnit.HOURS.between(today.atStartOfDay(), targetDate.atStartOfDay()) % 24;
//        long minutes = ChronoUnit.MINUTES.between(today.atStartOfDay(), targetDate.atStartOfDay()) % 60;
//        long seconds = ChronoUnit.SECONDS.between(today.atStartOfDay(), targetDate.atStartOfDay()) % 60;
//
//        System.out.println("Countdown until I come:");
//        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");


//        LocalDateTime startDateTime = LocalDateTime.of(2023, 4, 12, 10, 22, 0);
//        LocalDateTime endDateTime = LocalDateTime.of(2023, 4, 21, 0, 0, 0);
//
//        long days = startDateTime.until(endDateTime, ChronoUnit.DAYS);
//        long hours = startDateTime.until(endDateTime, ChronoUnit.HOURS) % 24;
//        long minutes = startDateTime.until(endDateTime, ChronoUnit.MINUTES) % 60;
//        long seconds = startDateTime.until(endDateTime, ChronoUnit.SECONDS) % 60;
//
//        System.out.printf("Countdown: %d days, %d hours, %d minutes, %d seconds%n", days, hours, minutes, seconds);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime targetDate = LocalDateTime.of(2023, 4, 21, 0, 0);
        Duration duration = Duration.between(now, targetDate);

        long days = duration.toDays();
        duration = duration.minusDays(days);
        long hours = duration.toHours();
        duration = duration.minusHours(hours);
        long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        long seconds = duration.getSeconds();

        System.out.printf("Time until April 21st, 2023: %d days, %02d:%02d:%02d", days, hours, minutes, seconds);
    }
}
