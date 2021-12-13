package org.education.bitsel;

import org.education.console.Console;

import java.util.Arrays;

public class BitwiseUtil {
    private BitwiseUtil() {}

    public static void writeBits(long val)
    {
        var valBinStr = Long.toBinaryString(val);
        char[] c = new char[64 - valBinStr.length()];

        Arrays.fill(c, '0');
        Console.write(String.valueOf(c) + valBinStr);
        Console.writeLine();
    }

    public static void writeBits(int val)
    {
        var valBinStr = Integer.toBinaryString(val);
        char[] c = new char[32 - valBinStr.length()];

        Arrays.fill(c, '0');
        Console.write(String.valueOf(c) + valBinStr);
        Console.writeLine();
    }

    public static void writeBits(short val)
    {
        var valBinStr = Integer.toBinaryString(val);
        char[] c = new char[16 - valBinStr.length()];

        Arrays.fill(c, '0');
        Console.write(String.valueOf(c) + valBinStr);
        Console.writeLine();
    }

    public static void writeBits(byte val)
    {
        var valBinStr = Integer.toBinaryString(val);
        char[] c = new char[8 - valBinStr.length()];

        Arrays.fill(c, '0');
        Console.write(String.valueOf(c) + valBinStr);
        Console.writeLine();
    }
}
