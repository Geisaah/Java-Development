package marathon.javadevelopment.introduction.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localdateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2025, Month.AUGUST, 5);
        LocalDate date1 = LocalDate.parse("2023-08-06");
        LocalTime time = LocalTime.of(9, 45, 21);
        System.out.println(date);
        System.out.println(time);
        System.out.println(localdateTime);
        System.out.println(localdateTime.getHour());
        System.out.println(localdateTime.getMonth());
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = date.atTime(12, 14, 35);
        LocalDateTime ldt3 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);


    }
}
