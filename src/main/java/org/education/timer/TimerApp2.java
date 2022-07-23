package org.education.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp2 extends Thread{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            new TimerApp2().start();
        }
        long end = System.currentTimeMillis();

        System.out.println("Sonuc: = " + (end - start));
    }

    @Override
    public void run()
    {
        Simple simple = Simple.callMe();
        if(simple != null)
             simple.printName();
    }
}

class Simple {
    static volatile Simple instance;
    private static int count;
    private  String name;

    public Simple()
    {
        name = "Thread" + count;
        count++;
    }

    public static void call()
    {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                callMe();
            }
        };

        timer.schedule(task, 5000, 10000);
    }

    public static Simple callMe()
    {
        if(instance == null)
            new Simple();

           var timer = new Timer();
            synchronized (Simple.class) {

                var timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        if (instance == null)
                            instance = new Simple();
                    }
                };
                timer.schedule(timerTask, 0, 1000);
            }
        return instance;
    }

    public static Simple callMeSingleton()
    {
        if(instance == null) {
            synchronized (Simple.class) {
                if(instance == null)
                 instance = new Simple();
            }
        }
        return instance;
    }


    public void printName()
    {
        System.out.println(name);
    }
}
