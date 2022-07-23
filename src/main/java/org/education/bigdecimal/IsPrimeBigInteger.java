package org.education.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class IsPrimeBigInteger {
    public static void main(String[] args)
    {
        long start =  System.currentTimeMillis();
        boolean flag =  isPrimeBigInteger(new BigInteger("1000000000000000003"));
        if(flag)
            System.out.println("Asal");
       // boolean flag = isPrimeTeacher(1000000000000000003L);
        long end = System.currentTimeMillis();

        long result = end - start;
        System.out.println(result);
    }

    public static boolean isPrimeTeacher(Long val)
    {
        if(val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if(val % 3 == 0)
            return val == 3;

        if(val % 5 == 0)
            return val == 5;

        if(val % 7 == 0)
            return val == 7;

        long sqrtIntValue = (long) Math.sqrt(val);

        for (int i = 11; i <= sqrtIntValue; i += 2)
            if(val % i == 0)
                return false;

        return true;
    }

    public static boolean isPrimeMe(Long val)
    {
        long sqrtIntValue = (long) Math.sqrt(val);

        for (int i = 2; i <= sqrtIntValue; i += 2)
            if(val % i == 0)
                return false;

        return true;
    }

    public static boolean isPrimeBigInteger(BigInteger val)
    {
        if(val.compareTo(BigInteger.ONE) <= 0)
            return false;

        if(val.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            return val.equals(BigInteger.TWO);

        if(val.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
            return val.equals(BigInteger.valueOf(3));

        if(val.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO))
            return val.equals(BigInteger.valueOf(5));

        if(val.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO))
            return val.equals(BigInteger.valueOf(7));

        BigInteger sqrtIntValue = val.sqrt();

        for (BigInteger i = BigInteger.valueOf(11); i.compareTo(sqrtIntValue) <= 0; i = i.add(BigInteger.TWO))
            if(val.mod(i).equals(BigInteger.ZERO))
                return false;

        return true;
    }
}
