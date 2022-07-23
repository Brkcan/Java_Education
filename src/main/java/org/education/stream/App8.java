package org.education.stream;

import java.util.Random;
import java.util.stream.Stream;

public class App8 {
    public static void main(String[] args)
    {
        var random = new Random();

        Stream.generate(() -> random.nextInt(25))
                .limit(10)
                .filter(a -> a > 23)
                //.forEach(System.out::println)
                .findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("bulunamadi!"));

    }
}
