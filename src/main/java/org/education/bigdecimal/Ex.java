package org.education.bigdecimal;

import org.education.console.Console;

public class Ex {
    public static void main(String[] args)
    {
        doubleEx();
    }

    public static void doubleEx()
    {
        double a = 0.1;
        double b = 0.2;
        double c;

        c = a + b;

        if(c == 0.3)
            Console.write("Esit...");
        else
            Console.write("Esit degil...");
    }
}
