package org.education.annotion;

/*
*   Java'da annotation'lar 3 kategoriye ayrilir.
*
*   1 - RunTime: Calisma zamaninda da kullanilmak uzere tasarlanmis bir annotation belirtir.
*                Bir annotation'in calisma zamaninda nasil kullanilacagi
*                reflection konusunda ele alanicaktir.
*
*
*   Bu ikisi derleyiciye kod urettirir;
*
*   2 - Class: Derleyici tarafindan ara koda yazilsa da calisma zamaninda kullanilamayan
*               annotation'dir.
*   3 - Source: Derleyicinin arakoda eklemedigi annotation'dir.
*
*   Yukaridaki kategorilere "retention policy" denir.
*
*   Bir annotation'in retention polixy degeri Retention isimli bir annotation ile belirtir.
*   Bir annotation'in hangi kategoride oldugu Retention isimli bir baska annotation ile
*   belirlenir. Bir annotation'a herhangi bir kategori verilmezse default olarak
*   CLASS kategorisinde olur.
*
*
*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class App4 {

}


@Retention(RetentionPolicy.RUNTIME)
@interface anno1 {

}
