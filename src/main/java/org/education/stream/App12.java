package org.education.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class App12 {
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        IntStream.range(0, str.length())
                .map(str::charAt)
                .filter(i -> !Character.isWhitespace(i))
                .forEach(ch -> System.out.printf("%c", ch));
    }
}
