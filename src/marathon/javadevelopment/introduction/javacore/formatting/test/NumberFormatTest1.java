package marathon.javadevelopment.introduction.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest1 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale locateJP = Locale.JAPAN;
        Locale locateIT = Locale.ITALY;
        Locale locateFR = Locale.FRANCE;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(locateJP);
        nfa[2] = NumberFormat.getCurrencyInstance(locateIT);
        nfa[3] = NumberFormat.getCurrencyInstance(locateFR);
        double value = 10_000_2130;
        for (NumberFormat numberFormat : nfa){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));

        }
        String valueString = "$10_000_2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
