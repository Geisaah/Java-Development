package marathon.javadevelopment.introduction.javacore.formatting.test;

import java.util.Locale;

public class LocaleTest1 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");

        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");

        }


    }
}