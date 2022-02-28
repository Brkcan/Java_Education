package org.education.localtype;

import org.education.console.Console;

public class LocalClassEx1 {
    public static void main(String[] args)
    {
        LocalClass aClass = new LocalClass();
        LocalClass.foo(10);
    }
}

class LocalClass {

    public static void foo (int a)
    {
        int b = 5;

        class A {
            public void bar()
            {
                Console.write("LocalClass.Foo.Bar()" + " ");
                Console.writeLine();
                Console.writeLine(a);
                Console.writeLine(b);
            }

        }
        A local= new A();
        local.bar();


        class B {

        }
    }

    public void bar ()
    {
        class A {

        }

        class X {

        }
    }
}
