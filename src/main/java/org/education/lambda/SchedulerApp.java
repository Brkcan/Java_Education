package org.education.lambda;

public class SchedulerApp {
    public static void main(String[] args)
    {
        Scheduler scheduler = new Scheduler(0,1000);
        scheduler.schedule(() ->  write(), () -> scheduler.cancel());
    }

    public static void write()
    {
        System.out.print(".");
    }
}

class SampleApp {

}
