package org.education.annotion.inherited;

import java.lang.annotation.Inherited;

/*
* Inherited annotion'i yalmiz annotation siniflara uygulanabilir.
*  Inherited olarak isaretlenen bir annotation turemis sinifa  da aktarilmis olur.
*/

public class App1 {
    public static void main(String[] args)
    {

    }
}

class B extends A {

}

@MyAnnotation10(bar = 10)
class A {

    public void foo()
    {
        System.out.println("A.Foo()");
    }
}

@Inherited
@interface MyAnnotation10 {
    int bar();
}
