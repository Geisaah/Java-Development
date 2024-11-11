package marathon.javadevelopment.javacore.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    public static void main(String[] args) {
        //0 \\d = All the digits
        //1 \\D = everything that is not digits
        //2 \\s = whitespace or blank space \t \n \f \r
        //3 \\S = All the caracter excluind white space
        //4 \\w = a-Z, digits, _
        //5 \\W = everything that is not included in \\w
        //6 []
        //7 [] []
        //8 ? Zero or one
        //8 * zero or more
        //8 + one or more
        //8 {n,m} from N to M
        //8 ()
        //8 |
        //8 $
        //9 .  1.3 = 123, 133, 1@3, 1A3


        String regex0 = "\\d";
        String regex1 = "\\D";
        String regex2 = "\\s";
        String regex3 = "\\S";
        String regex4 = "\\w";
        String regex5 = "\\W";
        String regex6 = "[a-zA-c]";
        String regex7 = "0[xX][0-9a-fA-F]";
        String regex8 = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String regex9 = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        System.out.println("valided email");
        System.out.println(" #@!bito@mail.com".matches(regex9));
       // System.out.println(Arrays.toString(text.split(",")));

        String text = "[abc]";
        String text1 = "h@hj# ol_ %58\tngv\n8w_7f_m\f";
        String text6 = "12 0x 0X 0XFFABC 0X109 0X1";
        String text7 = "12 0x 0X 0XFFABC 0X109 0X1";
        String text8 = "12 0x 0X 0XFFABC 0X10G 0X1";
        String text9 = "fulano@gmail.com, 123maya@gamil.com, #@!bito@mail.com, test@gmail.com.br, marley@mail";

        Pattern pattern = Pattern.compile(regex9);
        Matcher matcher = pattern.matcher(text9);
        System.out.println("text:  "+text9);
        System.out.println("index: 0123456789");
        System.out.println("regex "+regex9);
        System.out.println("positions found");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n ");
        }

    }
}
