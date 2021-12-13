package org.education.recursion.non.recursion;

public class Reverse {
    public static void main(String[] args)
    {
        String console = UtilReverse.getReverse("Burak");
        System.out.println(console);
    }
}

class UtilReverse{

    public static String getReverse(String str)
    {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString();
    }
}
