package org.education.stream;

import java.util.Random;
import java.util.stream.Stream;

public class App9 {
    public static void main(String[] args)
    {
        var random = new Random();

         Stream.generate(() -> random.nextInt(25))
                .limit(5)
                .peek(System.out::println)
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Toplanamadi!"));
    }
}
