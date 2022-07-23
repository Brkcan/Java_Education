package org.education.lambda;

import org.education.console.Console;

public class App2 {
    public static void main(String[] args)
    {
        IIntBinary<Integer> iIntBinary = (a, b) ->
        {
            Console.write("Deger: ");
            return a * b;
        };

        Console.writeLine(iIntBinary.foo(10,50));

    }
}

@FunctionalInterface
interface IIntBinary<T> {
    T foo (T a, T b);
}

@FunctionalInterface
interface IIntBinaryDefault<T> {
    T foo (T a, T b);

    default void bar()
    {
        Console.write("Default Fonksiyon...");
    }
}
