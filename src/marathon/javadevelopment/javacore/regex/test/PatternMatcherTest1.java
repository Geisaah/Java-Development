package marathon.javadevelopment.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        // \\d = All the digits
        // \\D = everything that is not digits
        // \\s = whitespace or blank space \t \n \f \r
        // \\S = All the caracter excluind white space
        // \\w = a-Z, digits, _
        // \\W = everything that is not included in \\w
        String regex = "\\d";
        String regex1 = "\\D";
        String regex2 = "\\s";
        String regex3 = "\\S";
        String regex4 = "\\w";
        String regex5 = "\\W";
        String text = "abaaba";
        String text1 = "h@hj# ol_ %58\tngv\n8w_7f_m\f";
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(text1);
        System.out.println("text:  "+text1);
        System.out.println("index: 0123456789");
        System.out.println("regex "+regex2);
        System.out.println("positions found");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n ");
        }
    }
}
