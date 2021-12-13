package org.education.recursion.non.recursion;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(NonFactorial.factorial(5));
    }
}

class NonFactorial {
    public static long factorial(int n)
    {
        long result  = 1;

        for(; n > 1; n--)
            result *= n;

        return result;
    }
}
