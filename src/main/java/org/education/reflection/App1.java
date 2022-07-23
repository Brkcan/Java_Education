package org.education.reflection;

/*
    1. ornek
*/

public class App1 {
    public static void main(String[] args)
    {
        Class<Sample> sampleClass = Sample.class;
        Class<Mample> mampleClass = Mample.class;

        Class<String> stringClass = String.class;
        Class<Integer> integerClass = Integer.class;

        Class<Integer> aClass = int.class;
        Class<?> aClass1 = double.class;

        Class<int []> aClass2 = int[].class;
    }
}

class Sample {

}

class Mample {

}
