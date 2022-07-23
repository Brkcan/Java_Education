package org.education.lambda;

import org.education.console.Console;

public class App4 {
    public static void main(String[] args)
    {
        Sample.display( s -> s.concat("Can"), "Burak");
    }
}

class Sample {
    public static <T, R> void display(IConverterApp<T, R> convert, R r)
    {
        T t = convert.convert(r);
        System.out.println(t);
    }
}

@FunctionalInterface
interface IConverterApp <T, R>{
    T convert(R r);
}
