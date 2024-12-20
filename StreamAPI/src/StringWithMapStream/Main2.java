package StringWithMapStream;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<List<Integer>>  list = Arrays.asList(Arrays.asList(1,2,3,4,56)
                ,Arrays.asList(1,3,4,56,5)
                ,Arrays.asList(2,4,56,7,32,2));


        List<Integer> listUptade= list.stream()
                        .flatMap(x->x.stream())
                                .toList();

        System.out.println(listUptade);
    }
}
