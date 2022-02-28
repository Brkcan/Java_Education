package org.education.nestedtype;

import org.education.console.Console;

public class NestedClassApp {
    public static void main(String[] args)
    {
        SampleNestedClass.A aClass = new SampleNestedClass.A();
        aClass.foo();
        SampleNestedClass.A.bar();
    }
    public static class FF {}
}


class SampleNestedClass {
    public static class A {
        public int x = 10;

        public void foo ()
        {
            Console.write("SampleNestedClass.A.Foo");
            Console.writeLine();
        }

        public static void bar()
        {
            Console.write("SampleNestedClass.A.Bar");
            Console.writeLine();
        }

    }


    protected static class B {}
    private static class C {}

    static class D {}
}
