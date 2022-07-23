package org.education.annotion;

public class App3 {
}

@My1annotation2(message = "This is a test")
class Sample2 {

    private int m_x;

}

@interface My1annotation2 {
    String message();
    int value() default 1;
}
