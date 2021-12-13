package org.education.recursion;

public class Ex1 {

    public static void main(String[] args)
    {
        Recursion.foo(3);
    }
}

class Recursion{

    public static void foo(int n)
    {
        System.out.println("Giris");

        if(n == 0)
            return;

        foo(n - 1);
        System.out.println("Cikis" + n);
    }
}
