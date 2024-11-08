package marathon.javadevelopment.introduction.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale locateJP = Locale.JAPAN;
        Locale locateIT = Locale.ITALY;
        Locale locateFR = Locale.FRANCE;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locateJP);
        nfa[2] = NumberFormat.getInstance(locateIT);
        nfa[3] = NumberFormat.getInstance(locateFR);
        double value = 10_000_2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(value));

        }
        String valueString = "10_000_2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
