package chap13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class TestTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        Locale.setDefault(new Locale("ar"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy, HH'h'mm ",locale);
        double d = 101515214.5;

        System.out.println(localDateTime.plusHours(3).format(formatter));
        System.out.printf(locale,"%.2f\n",d);
        System.out.printf(new Locale("en"),"%.2f\n",d);
        System.out.printf(new Locale("fr","CA"),"%.2f\n",d);
        System.out.printf("%.2f\n",d);
        Locale loc = new Locale.Builder().setLanguage("in").build();
        System.out.printf(loc,"%.2f\n",d);
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
    }
}
