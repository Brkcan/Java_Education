package org.education.stream;

import java.util.Random;
import java.util.stream.Stream;

public class App7 {
    public static void main(String[] args)
    {
        var random = new Random();

        var result = Stream.generate(() -> random.nextInt(25))
                .limit(5)
                .peek(System.out::println)
                .noneMatch(a -> a > 23);

        if (result)
            System.out.println("accept");
        else
            System.out.println("ignore");
    }
}
