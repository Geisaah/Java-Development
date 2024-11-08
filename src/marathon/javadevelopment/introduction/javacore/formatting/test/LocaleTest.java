package marathon.javadevelopment.introduction.javacore.formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeHolanda = new Locale("nl","NL");
        Locale localeBrasil = new Locale("br","BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println("Italy "+df1.format(calendar.getTime()));
        System.out.println("Suiça "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japao "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));
        System.out.println("Brasil "+df6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeBrasil));

        System.out.println(localeItaly.getDisplayLanguage(localeBrasil));
    }
}
