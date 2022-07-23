package org.education.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App4 {
    public static void main(String[] args)
    {
        Random r = new Random();
        //IntStream.generate(() -> r.nextInt(20)).limit(25).filter((a) -> a > 15).forEach(System.out::println);
        Stream.generate(Random::new).limit(15).map(a -> a.nextInt(25)).filter(a -> a < 5).forEach(System.out::println);
    }
}
