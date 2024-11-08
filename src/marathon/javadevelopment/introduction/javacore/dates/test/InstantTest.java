package marathon.javadevelopment.introduction.javacore.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}
