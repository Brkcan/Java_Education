package org.education.arrays;

import org.educationlib.ArrayUtil;

import java.util.Arrays;

public class ArraysSortEx {
    public static void main(String[] args)
    {
        var a = ArrayUtil.getRandomArray(10, 2,100);

        Arrays.sort(a);

        ArrayUtil.display(a);
    }
}
