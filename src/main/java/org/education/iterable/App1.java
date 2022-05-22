package org.education.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class App1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numbers.add(i * 20);

        Iterator<Integer> iter = numbers.iterator();

        Sample.display(iter);
    }
}

class Sample {

    public static <T> void display(Iterator<T> iter)
    {
        while (iter.hasNext()) {
            T val = iter.next();

            System.out.println(val);
        }
    }
}
