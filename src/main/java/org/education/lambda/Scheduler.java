package org.education.lambda;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public final class Scheduler {
    private final Timer m_timer;
    private final long m_delay;
    private final long m_period;
    private Runnable m_runnableCancel;

    public Scheduler(long m_period)
    {
        this(0, m_period, TimeUnit.MILLISECONDS);
    }

    public Scheduler(long m_delay, long m_period)
    {
        this(m_delay, m_period, TimeUnit.MILLISECONDS);
    }

    public Scheduler(long m_period, TimeUnit timeUnit)
    {
        this(0, m_period, timeUnit);
    }

    public Scheduler(long delay, long periyod, TimeUnit timeUnit)
    {
        m_timer = new Timer();
        m_delay = timeUnit != TimeUnit.MILLISECONDS ? TimeUnit.MILLISECONDS.convert(delay, timeUnit) : delay;
        m_period = timeUnit != TimeUnit.MILLISECONDS ? TimeUnit.MILLISECONDS.convert(periyod, timeUnit) : periyod;
    }


    public void schedule(Runnable runnable)
    {
        schedule(runnable, null);
    }

    public void schedule(Runnable runnable, Runnable runnableCancel)
    {
        m_runnableCancel = runnableCancel;

        m_timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runnable.run();
            }
        }, m_delay, m_period);
    }

    public void cancel()
    {
        if(m_runnableCancel != null)
            m_runnableCancel.run();

        m_timer.cancel();
    }

}
