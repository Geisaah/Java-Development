package marathon.javadevelopment.introduction.javacore.formatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE_TIME);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.ofPattern("yyyyMMdd"));  // CORREÇÃO!
        LocalDate parse2 = LocalDate.parse("20210219", DateTimeFormatter.ofPattern("yyyyMMdd"));  // CORREÇÃO!
        LocalDate parse3 = LocalDate.parse("20210219", DateTimeFormatter.ofPattern("yyyyMMdd"));  // CORREÇÃO!

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-02-19T18:46:04.1121294", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatterBR);
        LocalDate parseBR = LocalDate.parse("19/02/2023", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("19.Februar.2021", formatterGR);
        System.out.println(parseGR);

    }
}
