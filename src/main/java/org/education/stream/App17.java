package org.education.stream;

import java.util.stream.IntStream;

public class App17 {
    public static void main(String[] args)
    {
         IntStream.range(0, 10).filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
