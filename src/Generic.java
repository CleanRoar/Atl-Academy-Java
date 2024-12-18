import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Generic <T> {

    public <T>  void test (T[] list, Predicate<T> sert){

        Arrays.stream(list)
                .filter(sert)
                .forEach(System.out::println);

        }

    }

