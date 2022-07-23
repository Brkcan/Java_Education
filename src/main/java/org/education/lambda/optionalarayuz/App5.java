package org.education.lambda.optionalarayuz;

import org.education.console.Console;
import org.educationlib.StringUtil;

import java.util.Optional;
import java.util.Random;

public class App5 {
    public static void main(String[] args)
    {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Optional<String> pass = RandomPassGenerate5.getRandomPasswprdIfSatisfied(random, 5,10 );

            pass.filter(s -> s.length() > 6).ifPresentOrElse(System.out::println, () -> System.out.println("uretemedi..."));

        }
    }
}


class RandomPassGenerate5 {
    public static Optional<String> getRandomPasswprdIfSatisfied(Random r, int min, int max)
    {
        return r.nextBoolean() ? Optional.of(StringUtil.getRandomTextTR(r, r.nextInt(max - min) + min)) : Optional.empty();
    }
}
