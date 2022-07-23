package org.education.lambda;

/*
    Bir arayuzun bir ve yalniz bir tabe abstract metodu varsa bu arayuzlere "fonksiyonel interface"
    denir. Functional interface java 8 ile eklenmistir.
*/
public class App {
    public static void main(String[] args)
    {

    }
}

@FunctionalInterface
interface X {
    void foo();
}
