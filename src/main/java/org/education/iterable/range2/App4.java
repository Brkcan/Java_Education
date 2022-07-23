package org.education.iterable.range2;

import org.education.iterable.range.IntRange;

public class App4 {
    public static void main(String[] args)
    {
        var intRange = IntRange2.ofClosed(10, 60, val -> 2 * val + 2);

        for (Integer val : intRange)
            System.out.printf("%d ", val);
    }
}

