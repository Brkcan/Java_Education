package org.education.timer;

import org.educationlib.Console;

public class CallbackTimerMetot {
    public static void main(String[] args)
    {
        CountDownSchedulerTest.run();
    }
}

final class CountDownSchedulerTest {
    private CountDownSchedulerTest(){}

    public static void run()
    {
        var scheduler = new CountDownScheduler(10000, 1000) {
            private int m_count;

            @Override
            public void onTick(long millisUntilFinished)
            {
                ++m_count;
                Console.write("%02d\r", millisUntilFinished / 1000);
            }

            @Override
            public void onFinished()
            {
                Console.writeLine("Count: %d%n", m_count);
                Console.writeLine("Geri sayim tamamlandi...");
            }
        };
        scheduler.start();
    }
}
