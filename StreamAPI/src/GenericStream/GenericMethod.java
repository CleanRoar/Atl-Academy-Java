package GenericStream;

import java.util.Arrays;
import java.util.function.Predicate;

public class GenericMethod {


    public <T> void test(T[] list , Predicate<T> sert) {

        Arrays.stream(list)
                .filter(sert)
                .forEach(System.out::println);

    }

}

