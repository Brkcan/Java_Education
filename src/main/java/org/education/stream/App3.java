package org.education.stream;

import java.util.Random;
 import java.util.stream.Stream;

public class App3 {
    public static void main(String[] args)
    {
        Stream.generate(Random::new).limit(10).map(r -> r.nextInt(255)).forEach(System.out::println);
    }
}
