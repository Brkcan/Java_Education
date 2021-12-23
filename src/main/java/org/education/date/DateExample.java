package org.education.date;

import org.education.console.Console;

import java.util.Date;

public class DateExample {
    public static void main(String[] args)
    {
        Date date = new Date();

        long ms  = date.getTime();
        Console.writeInt("milisaniye: " + ms);

        Date date1 = new Date(ms);
        Console.write(date.toString());
        Console.writeLine();
        Console.write(date1.toString());
    }
}
