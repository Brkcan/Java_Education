package org.education.bitsel;

import org.education.console.Console;

/*
       Bitsel xor operatoru iki operandli araek durumunda yan etkisi olmayan soldan saga oncelikli
       bir operatordur.

       x    y       x ^ y
       1    1         0
       1    0         1
       0    1         1
       0    0         0
*/
public class BitwiseXor {
    public static void main(String[] args)
    {
        var a = Console.readInt("Bir sayi giriniz : ", "Hatali bir sayi girdiniz.");
        var b = Console.readInt("Diger sayiyi giriniz : ", "Hatali sayi girdiniz.");

        a ^= b;

        BitwiseUtil.writeBits(a);

        a ^= b;

        BitwiseUtil.writeBits(a);
    }
}
