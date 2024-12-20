package StringWithMapStream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("Kenan","Ali","Veli");
        List<String> listTest= list.stream()
                .map(x->String.join("  ",x.split(""))).toList();
        System.out.println(listTest);
        System.out.println();


        List<String> list2 = Arrays.asList("Kenan","Ali","Veli");
        List<String[]> list2Uptade = list2.stream()
                .map(x->x.split(""))
                .collect(Collectors.toList());

        for (String[] a : list2Uptade){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        List<String> list3 = Arrays.asList("Kenan","Ali","Veli");
        List<String> list3Uptade = list2.stream()
                .flatMap(x->Arrays.stream(x.split("")))
                .collect(Collectors.toList());
        System.out.println(list3Uptade);







    }
}
