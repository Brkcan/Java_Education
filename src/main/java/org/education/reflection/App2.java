package org.education.reflection;

/*
*     Bir ture iliskin yaratilan Class nesnesi bir tanedir. Yani her tur icin calisma
*   zamani sirasinda bir tane Class nesnesi yaratilir.
*
*
*/

public class App2 {
    public static void main(String[] args)
    {
        Class<String> stringClass1 = String.class;
        Class<String> stringClass = String.class;

        if (stringClass == stringClass1)
            System.out.println("Same");
    }

}
