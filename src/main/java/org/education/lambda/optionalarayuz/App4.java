package org.education.lambda.optionalarayuz;

import org.educationlib.StringUtil;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Random;

public class App4 {
    public static void main(String[] args)
    {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Optional<String> pass = RandomPassGenerate4.getRandomPasswprdIfSatisfied(r,r.nextBoolean());

            try {
                System.out.println(pass.orElseThrow());
            } catch (NoSuchElementException e) {
                System.out.println("No pass generate");
            }
        }
    }
}

class RandomPassGenerate4 {
    public static Optional<String> getRandomPasswprdIfSatisfied(Random r, boolean satisfied)
    {
        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, r.nextInt(10))) : Optional.empty();
    }
}
