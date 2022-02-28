package org.education.lambda;

import org.education.console.Console;

public class App5 {
    public static void main(String[] args)
    {
        StringUtil.displauy(s -> s.length(), "Can");
        StringUtil.displauy(s -> StringUtil.whiteSpace(s), "Bura K C Can");
    }
}

class StringUtil{
    public static void displauy(IConverterApp5 iConverterApp5, String s)
    {
        int result = iConverterApp5.convert(s);
        Console.writeLine(result);
    }

    public static int whiteSpace(String str)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)))
                ++count;
        }

        return count;
    }
}

@FunctionalInterface
interface IConverterApp5 {
    Integer convert(String s);
}
