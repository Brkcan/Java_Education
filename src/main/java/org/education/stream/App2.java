package org.education.stream;

import java.util.stream.IntStream;

public class App2 {
    public static void main(String[] args)
    {
        int n = 3;

        var result = IntStream.rangeClosed(1, n)
                .reduce((r, v) -> r * v);

        result.ifPresent(System.out::println);
    }
}
