package org.education.iterable.range;

public class App3 {
    public static void main(String[] args)
    {
        IntRange intRange = IntRange.of(10, 20, 6);

        for (Integer val : intRange)
            System.out.printf("%d ", val);
    }
}
