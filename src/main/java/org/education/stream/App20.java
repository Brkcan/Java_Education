package org.education.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App20 {
    public static void main(String[] args)
    {
        var list = IntStream.iterate(10, i -> i + 2).limit(5).toArray();

        Arrays.stream(list).forEach(System.out::println);

    }
}
