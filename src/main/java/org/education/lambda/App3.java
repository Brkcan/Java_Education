package org.education.lambda;

import org.education.console.Console;

public class App3 {
    public static void main(String[] args)
    {
        IConverter<Integer, String> iConverter = s -> s.length();
        Console.writeLine(iConverter.apply("Burak"));
    }
}

@FunctionalInterface
interface IConverter<T, R>{
    T apply(R a);
}
