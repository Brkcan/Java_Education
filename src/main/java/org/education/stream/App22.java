package org.education.stream;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App22 {
    public static void main(String[] args)
    {
        long collector = Stream.generate(Random::new)
                .map(random -> random.nextInt(10))
                .limit(200)
                .filter(i -> i < 5)
                .collect(Collectors.counting());

        Stream.of(collector).forEach(val -> System.out.printf("%d ", val));
    }
}
