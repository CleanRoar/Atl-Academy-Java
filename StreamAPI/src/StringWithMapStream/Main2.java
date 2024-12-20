package StringWithMapStream;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer>  list2 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2Uptade= list2.stream()
                .map(x->x).toList();

        System.out.println(list2Uptade);
    }
}
