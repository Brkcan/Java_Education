package org.education.stringbuilder;

import org.educationlib.StringUtil;

import java.util.Random;

public class StringBuilderReverse {
    public static void main(String[] args)
    {
        Builder builder =  new Builder();
        System.out.println(builder.reverse());

        System.out.println(builder.reverse("ankara"));

        builder.getRandomText();

        System.out.println(builder.getSqueeze("ankara","ardahan"));

    }
}

class Builder {

    // Hatali yontem
    // Eger bu yontemi kullanirsam, String immutable oldugu icin her seferinde ram'de yeni nesne yaratmasi gerektiginden islem pahali olur.
    // StringBuilder sinifini kullanmak daha mantikli olacaktir.
    public String reverse(String str)
    {
        String s = "";
        for(int i = str.length() - 1; i >= 0; i--)
            s += str.charAt(i);

        return s;
    }

    public String reverse()
    {
        StringBuilder stringBuilder = new StringBuilder("Bu yazinin tersi");
        stringBuilder.reverse();

        return stringBuilder.toString();
    }

    public String getRandomText()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");

        char[] c = new char[5];
        builder.getChars(2, 7, c, 0);

        for(char ch: c)
            System.out.print(ch + " ");

        System.out.println();
        return c.toString();
    }

    public String getSqueeze(String strF, String strS)
    {
        StringBuilder s1 = new StringBuilder();
        s1.append(strF);
        StringBuilder s2 = new StringBuilder();
        s2.append(strS);

        for(int i = 0; i <= s1.length() - 1; i++)
            for(int j = 0; j <= s2.length() -1; j++)
                if(s1.charAt(i) == s2.charAt(j)) {
                    s1.deleteCharAt(i);
                    i = 0;
                }

        return s1.toString();
    }
}


