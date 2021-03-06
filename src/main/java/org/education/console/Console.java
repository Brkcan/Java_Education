package org.education.console;


import java.util.Scanner;

public class Console {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Console() {}

    public static void writeLine()
    {
        write("\n");
    }

    public static void write(String str)
    {
        write("%s", str);
    }

    public static void write(String str, Object... objects)
    {
        System.out.printf(str, objects);
    }


    public static void writeLine(int val)
    {
        writeInt("%d", val);
    }

    public static void writeLine(long val)
    {
        writeInt("%d", val);
    }

    public static void writeInt(String str, Object... objects)
    {
        write(str + "\n", objects);
    }

    // READ
    public static void read(String str)
    {
        write(str);
        int result = Integer.parseInt(SCANNER.nextLine());
        writeLine(result);
    }

    public static void read(String str, String error)
    {
        try {
            write(str);
            int result = Integer.parseInt(SCANNER.nextLine());
            writeLine(result);
        }catch (Exception ex) {
            write(error);
        }
    }

    public static int readInt(String str, String error)
    {
        int result = 0;
        try {
            write(str);
            result = Integer.parseInt(SCANNER.nextLine());
            writeLine(result);
        } catch (Exception ex) {
            write(error);
        }
        return result;
    }

}
