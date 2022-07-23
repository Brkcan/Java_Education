package org.education.iterable.range2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;

public class IntRange2 implements Iterable<Integer>{
    private final int m_min;
    private final int m_max;
    private final IntUnaryOperator intUnaryOperator;

    private IntRange2(int m_min, int m_max)
    {
        this(m_min, m_max, 1);
    }

    private IntRange2(int m_min, int m_max, int m_step)
    {
        this(m_min, m_max, (m_step <= 1) ? (val -> val + 1): (val -> val + m_step));
    }

    private IntRange2(int m_min, int m_max, IntUnaryOperator intUnaryOperator)
    {
        this.m_min = m_min;
        this.m_max = m_max;
        this.intUnaryOperator = intUnaryOperator;
    }

    public static IntRange2 of(int m_min , int m_max)
    {
        return of(m_min,m_max, 1);
    }

    public static IntRange2 of(int m_min , int m_max, int m_step)
    {
        return ofClosed(m_min, m_max - 1, m_step);
    }

    public static IntRange2 ofClosed(int min, int max)
    {
        return ofClosed(min, max,1);
    }

    public static IntRange2 ofClosed(int min, int max, int step)
    {
        return new IntRange2(min, max, step);
    }

    public static IntRange2 ofClosed(int min, int max, IntUnaryOperator intUnaryOperator)
    {
        return new IntRange2(min, max, intUnaryOperator);
    }

    public int getM_min()
    {
        return m_min;
    }

    public int getM_max()
    {
        return m_max;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>()
        {
            int m_val = m_min;

            @Override
            public boolean hasNext()
            {
                return m_val <= m_max;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException();

                int val = m_val;

                m_val = intUnaryOperator.applyAsInt(val);

                return m_val;
            }
        };
    }
}
