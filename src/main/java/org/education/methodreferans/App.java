package org.education.methodreferans;

/*
* Method reference:
*   Method referansina iliskin ifadede fonksiyonel arayuz referansine atanabilir. Metot referansinin
*   genel bicimi:
*
*   <isim1>::<isim2>

    * isim1 sunlar olabilir.
    * referans tur ismi. referans ismi
    *
    * isim2 sunlar olabilir.
    * metot ismi, new anahtar sozcugu olabilir.
*/

public class App {
    public static void main(String[] args)
    {
        Sample sample = Integer::sum;
        System.out.println(sample.foo(10, 5));
    }
}

@FunctionalInterface
interface Sample {
    int foo(int x, int y);
}
