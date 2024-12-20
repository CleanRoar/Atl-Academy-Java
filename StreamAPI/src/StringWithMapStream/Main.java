package StringWithMapStream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kenan","Ali","Veli");

        List<String> listTest= list.stream()
                .map(x->String.join("  ",x.split(""))).toList();
        System.out.println(listTest);





    }
}
