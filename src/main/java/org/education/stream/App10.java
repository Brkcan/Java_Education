package org.education.stream;

import java.util.Random;
import java.util.stream.Stream;

public class App10 {
    public static void main(String[] args)
    {
        var random = new Random();

        var result = Stream.generate(() -> random.nextInt(25))
                .limit(5)
                .peek(System.out::println)
                .reduce(4, Integer::sum);

        System.out.println(result);
    }
}
