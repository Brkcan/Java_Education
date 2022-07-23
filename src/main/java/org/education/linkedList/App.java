package org.education.linkedList;

import java.util.LinkedList;

public class App {
    public static void main(String[] args)
    {
        LinkedList<Object> linkedList = new LinkedList<>();

        linkedList.push(null);
        for (int i = 0; i < 10; i++)
            linkedList.push(i * 10);

        Integer val;

        while ((val = (Integer) linkedList.pollFirst()) != null)
            System.out.printf("%d ", val);


    }
}
