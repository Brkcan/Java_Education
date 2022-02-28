package org.education.lambda.optionalarayuz;

/*
*
*    Oprional siniflari:
*
*   Programlamada siklikla karsimiza cikan bir durum vardir, Bir kosul saglandiginda bir bilgiye ihtiyacimiz olabilir.
*   Ancak kosul saglanmadiginda ise bu bilgiye ihtiyacimiz olmaz dolayisyla bilginin olusturulmamasi
*   gerekir. Bu sekildeki turlere "nullable types" denir. Yani kisacasi "optional" kavrami bir bilgi varsa kullanalim
*   yoksa kullanmayalim seklinde bir turdur.
*
*
*
*   Optional sinifinin empty metodu ile bos bos bir optional yaratilabilir.
*
*   Optional sinifinin of metodu ile optional bir bilgi Optional nesnesine yerlestirilebilir.
*/

import org.educationlib.StringUtil;

import java.util.Random;

public class App {

    public static void main(String[] args)
    {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            String  pass = RandomPasswordGenerator.getRandomPasswprdIfSatisfied(r, r.nextBoolean());

            if (pass != null)
                System.out.println("Password : " + pass);
            else
                System.out.println("No generate password");
        }
    }
}

class RandomPasswordGenerator {
    public static String getRandomPasswprdIfSatisfied(Random r, boolean satisfied)
    {
        return satisfied ? StringUtil.getRandomTextTR(r, r.nextInt(10)) : null;
    }
}
