package org.education.anonimmtype;

import org.education.console.Console;

public class AnonimClassEx1 {
    public static void main(String[] args)
    {
        AnonimClass an, an1;

        an = new AnonimClass() {};
        an1 = new AnonimClass();

        an.foo();

        Console.write(an.getClass().getName());
        Console.writeLine();
        Console.write(an1.getClass().getName());
    }
}

class AnonimClass {

    public void foo ()
    {
        Console.writeLine(10);
    }
}
