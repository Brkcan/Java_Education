package org.education.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public abstract class CountDownScheduler {
    private final Timer m_timer;
    private final long m_millisInFuture;
    private final long m_interval;
    private final TimerTask m_TimerTask;

    private TimerTask createTimerTask()
    {
        return new TimerTask() {
            private long m_value;
            @Override
            public void run() {
                var millisUntilFinished = m_millisInFuture - m_value;
                onTick(millisUntilFinished);
                m_value += m_interval;

                if(m_value < m_millisInFuture)
                    return;

                onFinished();
                cancel();
            }
        };
    }

    public CountDownScheduler(long m_millisInFuture, long m_interval)
    {
        this(m_millisInFuture, m_interval, TimeUnit.MILLISECONDS);
    }

    public CountDownScheduler(long m_millisInFuture, long m_interval, TimeUnit timeUnit)
    {
        this.m_millisInFuture = timeUnit != TimeUnit.MILLISECONDS ? TimeUnit.MILLISECONDS.convert(m_millisInFuture, timeUnit) : m_millisInFuture;
        this.m_interval = timeUnit != TimeUnit.MILLISECONDS ? TimeUnit.MILLISECONDS.convert(m_interval, timeUnit) : m_interval;
        this.m_timer = new Timer();
        this.m_TimerTask = this.createTimerTask();
    }

    public abstract void onTick(long millisUntilFinished);
    public abstract void onFinished();

    public final void start()
    {
        m_timer.schedule(m_TimerTask,0, m_interval);
    }

    public final void cancel()
    {
        m_timer.cancel();
    }
}
