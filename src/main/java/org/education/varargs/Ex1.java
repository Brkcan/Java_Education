package org.education.varargs;

public class Ex1 {

    public static void main(String[] args)
    {
        int [] dizi = {1, 2, 3, 4, 5};
        int result = Sample.sum(dizi);
        System.out.println(result);

        System.out.println(Sample.ellipsis(dizi));
        System.out.println(Sample.ellipsis(10, 20));

        System.out.println(Sample.format(1, "b" ));
    }
}


class Sample {
    private Sample(){}

    public static int sum(int [] a)
    {
        int total = 0;

        for (var value: a)
            total += value;

        return total;
    }

    public static int ellipsis(int... a)
    {
        int total = 0;

        for (var value: a)
            total += value;

        return total;
    }

    public static String format(int a, String... b)
    {
        String str = "Burak";

        return str;
    }

}
