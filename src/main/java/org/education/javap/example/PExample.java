package org.education.javap.example;

public class PExample {
    public static void main(String[] args)
    {
        PSample pSample = new PSample();
        pSample.var(9);
    }
}


class PSample {
    private static final boolean FLAG = false;

    private void foo(int val)
    {
        if(FLAG)
            assert val > 0 : "Deger 10'dan buyuk olmali";
    }

    public void var(int val)
    {
        foo(val);
    }
}
