package marathon.javadevelopment.introduction.javacore.dates.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1_000_000); // long time in miliseconds
        System.out.println(date);

    }
}
