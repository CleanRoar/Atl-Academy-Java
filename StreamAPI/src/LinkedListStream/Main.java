package LinkedListStream;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // LinkedList'le bir list yaradin ,
        // Stream methodlarindan isdifade edin ,
        // cut ededleri 2 qat artirin , 20 den boyuk olanlari secin, siralayin ve cap edin zehmet olmazsa .


        LinkedList<Integer> list = new LinkedList<>();
        list.add(24);
        list.add(15);
        list.add(22);
        list.add(14);
        list.add(21);
        list.add(16);
        list.add(23);
        list.add(20);

        // .filter listimizdeki elemebtleri hansisa sertler ile cagira predicate ede bilerik.
        // .map ise cagirdigimiz hemin elemente deyisiklik etmeye imkan verir.
        // terminal methodlari ise axini tamamlayir methoda uygun deyer qaytarir.

        List<Integer> test = list.stream()
                .filter(x -> (x % 2 == 0))
                .filter(x->x>=20)
                .map(x->x*2)
                .sorted()
                .toList();
        System.out.println(test);

//        Stream<Integer> test = list.stream()
//                .filter(x -> (x % 2 == 0))
//                .filter(x->x>=20)
//                .map(x->x*2)
//                .sorted();
//        test.forEach(System.out::println);


    }
}
