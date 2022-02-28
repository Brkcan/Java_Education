package org.education.anonimmtype;

import org.education.console.Console;

public class AnonimClassEx2 {
    public static void main(String[] args)
    {
        Anonim1 anonim1 = new Anonim1() {

            {
                System.out.println("Test");
            }

            public void foo ()
            {
                Console.write("Burak-Anonim");
            }
        };
        anonim1.foo();
    }
}

class Anonim1 {

    public void foo ()
    {
        Console.write("Burak");
    }
}
