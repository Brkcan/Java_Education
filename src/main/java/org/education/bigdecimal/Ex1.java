package org.education.bigdecimal;

import org.education.console.Console;

import java.math.BigDecimal;

public class Ex1 {
    public static void main(String[] args)
    {
        factoryMethod();
        question();
    }

    public static void factoryMethod()
    {
        var a = BigDecimal.valueOf(0.1);
        var b = BigDecimal.valueOf(0.2);
        var c = BigDecimal.valueOf(0.3);
        var d = a.add(b);
        if(c.equals(d))
            Console.write("Esittir...");
        else
            Console.write("Esit degildir...");
    }

    public static void question()
    {
        var max = BigDecimal.ZERO;
        var min = new BigDecimal(Integer.MAX_VALUE);
        var sum = BigDecimal.ZERO;
        while (true) {
            var sayi = org.educationlib.Console.readBigDecimal("Bir sayi giriniz...");

            if(sayi.equals(BigDecimal.ZERO))
                break;

            sum = sum.add(sayi);

            if(sayi.compareTo(min) < 0)
                min = sayi;

            if (sayi.compareTo(max) > 0)
                max = sayi;

        }
        System.out.println("sum: " + sum);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
