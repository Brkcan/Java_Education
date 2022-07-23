package org.education.lambda.optionalarayuz;

import org.educationlib.StringUtil;

import java.util.Optional;
import java.util.Random;

public class App3 {
    public static void main(String[] args)
    {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Optional<String> pass = RandomPassGenerate.getRandomPasswprdIfSatisfied(r,r.nextBoolean());

            System.out.println(pass.orElse("No pass generate"));
        }
    }
}

class RandomPassGenerate {
    public static Optional<String> getRandomPasswprdIfSatisfied(Random r, boolean satisfied)
    {
        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, r.nextInt(10))) : Optional.empty();
    }
}
