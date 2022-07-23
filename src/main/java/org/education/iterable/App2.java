package org.education.iterable;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numbers.add(i * 10);

        for (Integer val : numbers)
            System.out.printf("%d ", val);

        System.out.println();
    }
}
