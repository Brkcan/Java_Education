package org.education.lambda.metotreferansi;

/*
    Metot referansi cesitleri:
    1 - static metot referansi (static methos reference)
    2 - Bir nesneye iliskin non-static  referansi ()
    3 - Bir ture iliskin non-static metot referansi
    4 - ctor referansi
*/

import org.educationlib.NumberUtil;

import java.math.BigInteger;
import java.util.Random;

public class App6 {
    public static void main(String[] args)
    {
        // static metot referansi

        IIntBinaryOperator binaryOperator = Operation::add;  // (a, b) -> Operation.add(a, b);
        int result = binaryOperator.apply(10, 15);
        System.out.println(result);
        System.out.println("----------------------------------------------");

        IIntPredicate iIntPredicate = NumberUtil::isPrime; // a -> NumberUtil.isPrime(a)
        if (iIntPredicate.test(101))
            System.out.println("Asal");
        else
            System.out.println("Asal Degil");
        System.out.println("----------------------------------------------");

        BigInteger bigInteger = new BigInteger("10");
        IIntPredicate iIntPredicate1 = bigInteger::isProbablePrime;
        System.out.println(iIntPredicate1.test(7) ? "Asal" : "Asal Degil");
        System.out.println("----------------------------------------------");

        // nesne metot referansi

        Random random = new Random();
        IIntSupplier iIntSupplier = random::nextInt;// () -> random.nextInt()
        System.out.println(iIntSupplier.get());
        System.out.println("----------------------------------------------");

        // Bir ture iliskin non-static metot referansi

        IIntRandomSupplier randomSupplier = Random::nextInt; //r -> r.nextInt();
        System.out.println(randomSupplier.get(random));
        System.out.println("----------------------------------------------");

        IIntRandomBoundSupplier boundSupplier = Random::nextInt; // (r, b) -> r.nextInt(b);
        System.out.println(boundSupplier.get(random, 144));
        System.out.println("----------------------------------------------");

        IStringToIntConverter toIntConverter = String::length;
        System.out.println(toIntConverter.convert("Burak"));
        System.out.println("----------------------------------------------");

        // ctor referansi

        IDefaultFactory<IntValue> iDefaultFactory = IntValue::new;
        iDefaultFactory.create();
        System.out.println("----------------------------------------------");

        IFactory<Integer, IntValue> iFactory = IntValue::new; // a -> new IntValue(a)
        iFactory.create(10);
        System.out.println("----------------------------------------------");
    }
}

class Operation {

    public static int add(int a, int b)
    {
        return a + b;
    }
}

class IntValue {
    private int m_val;

    public IntValue()
    {
        System.out.println("IntValue.IntValue()");
    }

    public IntValue(int val)
    {
        System.out.println("IntValue.IntValue(int)");
        this.m_val = val;
    }
}

interface IFactory<T, R> {
    R create(T t);
}

interface IDefaultFactory<R> {
    R create();
}

interface IIntRandomBoundSupplier {
    int get(Random r, int bound);
}

interface IIntRandomSupplier {
    int get(Random r);
}

interface IIntSupplier {
    int get();
}

interface IIntPredicate {
    boolean test(int val);
}

interface IStringToIntConverter {
    int convert(String s);
}

interface IIntBinaryOperator {
    int apply(int a, int b);
}

