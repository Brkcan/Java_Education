package org.education.recursion;

public class ReverseRecursive {
    public static void main(String[] args)
    {
        String console = UtilReverseRecursive.getRecursive("burak");
    }
}

class UtilReverseRecursive {

    public static String getReverse(String str)
    {
        int i = str.length() - 1;
        char s = 0;

        for(; i >= 0; i--) {
            s = str.charAt(i);
            System.out.print(s);
        }
        return String.valueOf(s);
    }

    public static String getRecursive(String str)
    {
        return getReverse(str);
    }
}
