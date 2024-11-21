package marathon.javadevelopment.introduction.javacore.dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1998, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        ChronoUnit.DAYS.between(birthday, now );
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS.between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
    }
}