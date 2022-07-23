package org.education.stream;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App15 {
    public static void main(String[] args)
    {
        var list = Stream.generate(Random::new)
                .limit(10)
                .map(random -> random.nextInt(10))
                .sorted()
                .collect(Collectors.toList());

        list.forEach(val -> System.out.printf("%d ", val));

        System.out.println();

        list.stream()
                .skip(5)
                .forEach(val -> System.out.printf("%d ", val));

    }

}
