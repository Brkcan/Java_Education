package org.education.nestedtype;

import org.education.console.Console;

public class NestedClassApp2 {
    public static void main(String[] args)
    {
        A a = new A();
        a.foo(5);
    }
}

class A {
    public  void foo(int a)
    {
        B b = new B();
        b.x = a;
        b.bar();

        B.tar();
    }

    private static class B {
        public int x;

        public void bar()
        {
            Console.write("A.B.Bar" + x);
            Console.writeLine();
        }

        public static void tar()
        {
            Console.write("A.B.Tar");
            Console.writeLine();
        }
    }
}
