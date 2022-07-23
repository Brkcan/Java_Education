package org.education.iterable.range;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class IntRange implements Iterable<Integer>{
    private final int m_min;
    private final int m_max;
    private int m_step = 0;

    private IntRange(int m_min, int m_max)
    {
        this.m_min = m_min;
        this.m_max = m_max;
    }

    private IntRange(int m_min, int m_max, int m_step)
    {
        this.m_min = m_min;
        this.m_max = m_max;
        this.m_step = m_step;
    }

    public static IntRange of(int m_min , int m_max)
    {
        return of(m_min,m_max, 1);
    }

    public static IntRange of(int m_min , int m_max, int m_step)
    {
        return ofClosed(m_min, m_max - 1, m_step);
    }

    public static IntRange ofClosed(int min, int max)
    {
        return ofClosed(min, max,1);
    }

    public static IntRange ofClosed(int min, int max, int step)
    {
        return new IntRange(min, max, step);
    }

    public int getM_min()
    {
        return m_min;
    }

    public int getM_max()
    {
        return m_max;
    }

    public int getM_step()
    {
        return m_step;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>()
        {
            int m_val = m_min - m_step;

            @Override
            public boolean hasNext()
            {
                return m_val + 1 <= m_max;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException();

                if(m_step == 0)
                    return ++m_val;

                return m_val += m_step;
            }
        };
    }
}
