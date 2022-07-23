package org.education.arrays;

import org.education.console.Console;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args)
    {
        var n = Console.readInt("Bir sayi giriniz...", "Hatali sayi girdiniz!!!");

        boolean[] flag = new boolean[n];

        Arrays.fill(flag, true);
        System.out.println(Arrays.toString(flag));
        for (int i = 0; i <= flag.length - 1; i++)
            System.out.println(flag[i]);
    }
}
