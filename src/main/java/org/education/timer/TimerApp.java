package org.education.timer;

import org.education.console.Console;

import java.util.Timer;
import java.util.TimerTask;

/*
    java.util.Timer sinifi peroyodik islerin arka planda yapilmasi icin kullanilan temel siniflardan biridir.
    Bu sinifin scheduleXXX isimli metotlari ile ayri bir akis (thread) olusturulur.

*/
public class TimerApp {
    public static void main(String[] args)
    {
        var timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Console.write(".");
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
