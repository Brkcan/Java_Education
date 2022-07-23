package org.education.stream;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App13 {
    public static void main(String[] args)
    {
//        var r = new Random();
//        AtomicInteger i = new AtomicInteger(2);
//        IntStream.range(0, 9)
//                .map(a -> r.nextInt(100))
//                .peek(System.out::println)
//                .filter(val -> val % i.getAndIncrement() == 0)
//                .forEach(val -> System.out.println("Asal: " + val));

        System.out.println();
        Stream.generate(Random::new).limit(10).map(a -> a.nextInt(100)).filter(Util::isPrime).forEach(System.out::println);
    }
}

class Util {
    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        for (int i = 2; i < val/2; i++)
            if (val % i == 0)
                return false;
            return true;
    }
}
