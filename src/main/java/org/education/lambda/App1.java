package org.education.lambda;

import org.education.console.Console;

public class App1 {
    public static void main(String[] args)
    {
        IIntBinaryOperator  iIntBinaryOperator = (a, b) ->  a + b;
        IBinaryOperator<String> iBinaryOperator = (s1, s2) -> s1.concat(s2);
        ILongBinaryOperator<Integer, String> iLongBinaryOperator = (x, y) -> x.length() + y.length();

        Console.writeLine(iIntBinaryOperator.applyAsInt(10,20));
        Console.writeLine();
        Console.write(iBinaryOperator.apply("Burak", "Can"));

        Console.writeLine();
        Console.writeLine(iLongBinaryOperator.apply("Burak", "Can"));
    }
}

@FunctionalInterface
interface IIntBinaryOperator {
    int applyAsInt(int a, int b);
}

@FunctionalInterface
interface IBinaryOperator<T> {
    T apply(T a, T b);
}

@FunctionalInterface
interface ILongBinaryOperator<T, R> {
    T apply(R a, R b);
}
