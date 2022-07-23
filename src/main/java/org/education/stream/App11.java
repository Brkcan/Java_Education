package org.education.stream;

import java.util.stream.IntStream;

public class App11 {
    public static void main(String[] args)
    {
        //IntStream.range(0, 26).forEach(i -> System.out.printf("%c", (char) ('A' + i)));
        IntStream.range(0, 26).mapToObj(i -> (char) ('A' + i)).forEach(System.out::print);

    }
}
