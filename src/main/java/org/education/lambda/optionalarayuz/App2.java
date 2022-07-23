package org.education.lambda.optionalarayuz;

import org.educationlib.StringUtil;

import java.util.Optional;
import java.util.Random;

public class App2 {
    public static void main(String[] args)
    {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Optional<String> pass = RandomPasswordGenerator3.getRandomPasswordIfSatisfield(r,r.nextBoolean());

            if (pass.isPresent())
                System.out.println(pass.get().toUpperCase());
            else
                System.out.println("No generate password");
        }
    }
}


class RandomPasswordGenerator3 {

    public static Optional<String> getRandomPasswordIfSatisfield(Random r,boolean satisfied)
    {
        String result = satisfied ? StringUtil.getRandomTextTR(r, r.nextInt(10)) : null;

        return Optional.ofNullable(result);
    }
}
