package org.education.stream;

/*
*   Stream API Java 8 ile eklenmistir. Java I/O streamlerden farklidir. Streamler bir veri kaynagi uzerinden cesitli
*   islemlerin hizli ve kolay bir sekilde yapilmasini saglar.
*
*   Stream'lerin temel ozellikleri sunlardir...
*
*   - Stream'ler veri tutmazlar.
*   - Stream'ler veriler uzerinde degisiklik yapmazlar.
*   - Stream'ler fonksiyonel programlama teknigine uygun olarak tasarlanmislardir.
*   - Stream'ler bir diziden, bir collection siniftan veya bir I/O channel'i kaynak veri olarak kullanabilir.
*   - Stream API icerisinde cesitli islemleri "paralel olarak" yapabilen "paralel stream" de bulunur.
*
*       Stream islemleri iki gruba ayrilir:
*   - Ara islemler (intermediate operations) : Terminal islemi ile calistirilan islemlerdir. Bir terminal islemi
*     olmadan calistirilmazlar. Ara islemler Stream referansini geri donerler.
*   - Terminal islemler (Terminal operations): Cagrildiklarinda artik tum zincir calistirilir.
*
*
*   Stream kullanilirken yazilan zincire genel olarak pipeline denir. Bir "Stream pipeline" sifir veya daha fazla
*   ara islem icerebilir. Ancak bir tane terminal islem icerebilir.
*/

public class App {
}
