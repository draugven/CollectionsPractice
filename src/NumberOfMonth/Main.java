package NumberOfMonth;

import java.util.*;
import java.text.DateFormatSymbols;

/**
 * Created by Elizaveta Naimark on 18.09.2016.
 */

/*Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5th month».*/


public class Main {
    public static void main(String[] args) {
        String month;

        List<String> months = new ArrayList<String>(Arrays.asList(new DateFormatSymbols(new Locale("en", "US")).getMonths()));

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Month name");
        month = in.nextLine();

        StringBuilder sout = new StringBuilder();

        sout.append(month);
        sout.append(" is ");
        sout.append(months.indexOf(month) + 1);

        if (!months.contains(month)) {
            throw new InvalidInputException("Invalid month is entered^ " + month);
        } else if (months.indexOf(month) == 0) {
            sout.append("st month");
        } else if (months.indexOf(month) == 1) {
            sout.append("nd month");
        } else if (months.indexOf(month) == 2) {
            sout.append("rd month");
        } else {
            sout.append("th month");
        }

        System.out.println(sout);
    }
}
