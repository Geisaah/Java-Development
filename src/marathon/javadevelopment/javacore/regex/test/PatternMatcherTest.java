package marathon.javadevelopment.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String regex = "ab";
        String text = "abaaba";
        String text1 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text1);
        System.out.println("text:  "+text1);
        System.out.println("index: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("positions found");
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
