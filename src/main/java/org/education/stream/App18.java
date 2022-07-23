package org.education.stream;

import java.util.stream.IntStream;

public class App18 {
    public static void main(String[] args)
    {
        IntStream.iterate(0, i -> i + 2).limit(20).forEach(System.out::println);
    }
}
