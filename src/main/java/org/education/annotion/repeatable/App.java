package org.education.annotion.repeatable;

import java.lang.annotation.*;

public class App {
    public static void main(String[] args)
    {

    }
}

class Sample {

    @Command(value = "Test1")
    @Command(value = "Test2")
    @Command(value = "Test3")
    public void foo()
    {

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Commands {
    Command [] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Commands.class)
@interface Command {
    String value();
}
