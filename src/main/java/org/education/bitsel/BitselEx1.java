package org.education.bitsel;

import org.education.console.Console;

public class BitselEx1 {

    public static void main(String[] args)
    {
        var x = 0x80000B00;
        var y = 0x00000B00;

        Console.writeInt("x=" + x);
        Console.writeInt("y=" + y);

        Console.writeLine(Integer.compare(x,y));

        Console.read("Bir sayi giriniz...", "Hatali bir sayi girdiniz...");

        //org.educationlib.Console.readInt("","");
    }
}
