package org.education.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App23 {
    public static void main(String[] args)
    {
         var count = StreamUtil.filter(Stream.generate(Random::new)
                 .limit(100)
                 .map(random -> random.nextInt(10)),
                 i -> i < 5,
                 Collectors.counting());

        System.out.printf("%d ", count);
    }
}
