package org.education.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
*  Target hedef durumunu secer,
*  Class metot vs vs
*/

public class App5 {
    public static void main(String[] args)
    {

    }
}

@ButtonAnnotation({ButtonStatus.OK, ButtonStatus.YES, ButtonStatus.CANCEL})
class window {

}

@ButtonAnnotation(ButtonStatus.NO)
class dialogBox {

}

enum ButtonStatus {
    OK, YES, NO, CANCEL
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ButtonAnnotation {
    ButtonStatus[] value() default ButtonStatus.OK;
}
