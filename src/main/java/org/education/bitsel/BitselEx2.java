package org.education.bitsel;

import org.education.console.Console;

import java.util.Arrays;

/*
            ~                   --> bitwise not
            <<                  --> left shift
            >>                  --> right shift
            >>>                 --> unsigned right shift
            &                   --> bitwise and
            ^                   --> bitwise xor (exclusive or)
            |                   --> bitwise or
     >>=, <<=, >>>=, &=, |=, ^= -->
*/

public class BitselEx2 {

    public static void main(String[] args)
    {
        WriteBitsIntTest.run();
    }
}

class WriteBitsIntTest{
    private WriteBitsIntTest() {}

    public static void run()
    {
        for (;;) {
            var val = Console.readInt("Bir Sayi giriniz...", "Hatali Sayi girdiniz.");
            Util.bitwiseExample(val);

            if(val == 0)
                break;
        }
    }
}

class Util {
    private Util() {}

    public static void bitwiseNot(int val)
    {
        int result = ~val;
        BitwiseUtil.writeBits(result);
        BitwiseUtil.writeBits(val);
    }

    public static void bitwiseLeftShift(int val)
    {
        int result = val << 1;
        BitwiseUtil.writeBits(result);
        BitwiseUtil.writeBits(val);
    }

    public static void bitwiseRightShift(int val)
    {
        int result = val >> 1;
        Console.writeInt("result = "+ result);
        BitwiseUtil.writeBits(result);
        BitwiseUtil.writeBits(val);
    }

    public static void bitwiseExample(int val)
    {
        int result = ~val;
        while (result != 0) {
            result >>>= 1;
            if (result == Integer.MAX_VALUE) {
                BitwiseUtil.writeBits(~result);
                break;
            }
        }
    }
}
