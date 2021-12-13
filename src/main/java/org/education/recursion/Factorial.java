package org.education.recursion;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(FactorialClss.fact(5));
    }
}

class FactorialClss {

    public static long fact (int n)
    {
        long result = 1;

        if(n > 1) result = n * fact(n - 1);

        return result;
    }
}

