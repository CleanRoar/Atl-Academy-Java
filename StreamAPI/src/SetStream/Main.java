package SetStream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Setden  istifade ederek list yaradin.
        //Stream methodlarindan isdifade ederek
        //
        // uzunluğu 5 və ya daha çox olanları seçmək,
        //
        //
        //sıralamaq və çap etmək lazimdir.


        Set<String> list =new HashSet<>();
        list.add("Kenan");
        list.add("GulCohre");
        list.add("GulCohre");
        list.add("Can");
        list.add("Peri");



        // Burda niye Stream<T> isletmek duzgun deyil cunki biz bir defe istifade ede bilerik .
        // collect(Collectors.toList()) amma java 16dan sonra toList deye bilirem bu kod bizim axini bitirmek ve bir yerde meselen (Set,List) kimi yerde
        // yigmaq koleksiya etmekdir ki basqa yerdede cagirib basqa icralar gorek .

//        Stream<String> test = list.stream()
//                .filter(x->x.length()>5);
//       test.forEach(System.out::println);

        List<String> test = list.stream()
                .filter(x->x.length()>5)
                .sorted()
                .toList();
        System.out.println(test);
        //Output : birdene GulCohre cixir.


    }
}
