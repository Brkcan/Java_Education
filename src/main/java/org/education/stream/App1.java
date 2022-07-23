package org.education.stream;

import java.util.stream.IntStream;

public class App1 {
    public static void main(String[] args)
    {
        int n = 20;

        int sum  = IntStream.rangeClosed(0, n).sum();

        System.out.println(sum);
    }
}
