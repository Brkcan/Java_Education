package org.education.lambda.optionalarayuz;


import org.educationlib.StringUtil;

import java.util.Optional;
import java.util.Random;

public class App1 {
    public static void main(String[] args)
    {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            Optional<String>  pass = RandomPasswordGenerator2.getRandomPasswprdIfSatisfied(r, r.nextBoolean());

            if (pass.isPresent()) {
                System.out.println("Password : " + pass.get());
            } else
                System.out.println("No generate password");
        }
    }
}

class RandomPasswordGenerator2 {
    public static Optional<String> getRandomPasswprdIfSatisfied(Random r, boolean satisfied)
    {
        return satisfied ? Optional.of(StringUtil.getRandomTextTR(r, r.nextInt(10))) : Optional.empty();
    }
}
