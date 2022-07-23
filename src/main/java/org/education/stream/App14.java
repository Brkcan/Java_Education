package org.education.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App14 {
    public static void main(String[] args)
    {
        Stream.generate(Random::new)
                .map(random -> random.nextInt(5))
                .limit(20)
                .distinct()
                .forEach(System.out::println);
    }
}

