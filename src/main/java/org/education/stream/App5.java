package org.education.stream;

import java.util.Random;
import java.util.stream.Stream;

public class App5 {
    public static void main(String[] args)
    {
        var random = new Random();

        var result = Stream.generate(() -> random.nextInt(25))
                .limit(5)
                .peek(System.out::println)
                .allMatch(a -> a > 10);

        if (result)
            System.out.println("accept");
        else
            System.out.println("ignore");
    }
}
