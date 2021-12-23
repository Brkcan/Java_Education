package org.education.date;

import org.education.console.Console;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

    public static void main(String[] args)
    {
        Calendar now  = Calendar.getInstance();

        Console.write("Calendar: "+ now.get(Calendar.DAY_OF_MONTH) + "/" +
                (now.get(Calendar.MONTH) + 1) + "/" +
                now.get(Calendar.YEAR));

        Console.writeLine();

        gregorianCalendar();

        Console.writeLine();

        afterCalendar();
    }

    public static void gregorianCalendar()
    {
        Calendar birthDate  = new GregorianCalendar(1992, Calendar.APRIL, 15);
        Calendar now = new GregorianCalendar();

        var age = (now.getTimeInMillis() - birthDate.getTimeInMillis()) / (1000. * 60 * 60 * 24 * 365);
        Console.writeInt("YAS: " + age);
    }

    public static void afterCalendar()
    {
        var now = new GregorianCalendar();
        var afterDate = new GregorianCalendar(2022, Calendar.APRIL, 15);

        if(afterDate.after(now))
            Console.write("Daha var ");
        else
            Console.write("Zaman gecmis...");

    }
}
