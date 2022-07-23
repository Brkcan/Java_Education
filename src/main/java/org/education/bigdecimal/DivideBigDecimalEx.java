package org.education.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DivideBigDecimalEx {
    public static void main(String[] args)
    {
        BigDecimal a = new BigDecimal(5);
        BigDecimal b = new BigDecimal(8);
        var result =  a.divide(b, 5, RoundingMode.CEILING);
        System.out.println(result);


        BigDecimal a1 = new BigDecimal(5);
        BigDecimal b1 = new BigDecimal(8);
        MathContext mathContext = new MathContext(10);
        var result1 =  a1.remainder(b1, mathContext);
        System.out.println(result1);
    }
}
