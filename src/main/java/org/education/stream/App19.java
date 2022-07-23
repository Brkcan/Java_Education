package org.education.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App19 {
    public static void main(String[] args)
    {
       var arr = IntStream.rangeClosed(10, 20).toArray();

        for (int j : arr) System.out.printf("%d ", j);

        System.out.println();

        Arrays.stream(arr).forEach(val -> System.out.printf("%d ", val));
    }
}
