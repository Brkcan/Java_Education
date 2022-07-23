package org.education.date;

import org.education.console.Console;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args)
    {
        var date = LocalDate.of(1992, Month.APRIL, 15);
        Console.write("" + date.getYear() +" "+ date.getMonth() +" "+ date.getDayOfMonth() +" "+ date.getDayOfWeek());

        Console.writeLine();

        getBetween();

        Console.writeLine();

        getPlus();

        getTime();
    }

    public static void getBetween()
    {
        var now = LocalDate.now();
        var bigEarthQuake = LocalDate.of(1999, Month.AUGUST, 17);
        Console.writeLine(Math.abs(ChronoUnit.YEARS.between(now, bigEarthQuake)));
    }

    public static void getPlus()
    {
        var now = LocalDate.now().plusDays(1);
        Console.write(now.toString());
    }

    public static void getTime(){

        for(;;) {
            var dateTime = LocalDateTime.now();
            System.out.println(dateTime.toLocalTime());
            /*try {
               Thread.sleep(1000);
            }catch (InterruptedException ex) {
                Console.write(ex.getMessage());
            }*/
            var finishedTime = LocalDateTime.of(2021, Month.DECEMBER, 19, 2, 28, 45);
            if(ChronoUnit.SECONDS.between(dateTime, finishedTime) == 0)
                break;
        }
    }
}
