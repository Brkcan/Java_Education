package org.education.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App21 {
    public static void main(String[] args)
    {
        var n = 10;
        var a = IntStream.iterate(0, i -> i < n, i -> i + 1)
                .toArray();

        var random = new Random();
        var b = IntStream.generate(() -> random.nextInt(100)).limit(10)
                .toArray();

        var c = IntStream.concat(IntStream.of(a), IntStream.of(b)).limit(12).toArray();

        Arrays.stream(a).forEach( i -> System.out.printf("%d ", i));
        System.out.println();
        Arrays.stream(b).forEach( i -> System.out.printf("%d ", i));

        System.out.println();

        Arrays.stream(c).forEach(i -> System.out.printf("%d ", i));
    }
}
