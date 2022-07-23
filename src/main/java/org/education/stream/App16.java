package org.education.stream;

import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App16 {
    public static void main(String[] args)
    {
        var list = Stream.generate(Random::new).limit(20)
                .map(random -> random.nextInt(20))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
