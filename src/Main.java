import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        Interface x = (a,b)->{
//            var sum =a+b;
//            var average=sum/2;
//            return sum + average;
//        };
//        System.out.println(x.k(10,2));
//
////        FcInterface c =(a)->{
////            for (var i =0 ; i<=10; i++){
////                System.out.println(i*a);
////            }
////        };
////        c.test(10);
//
//        ArrayList<Integer> test =new ArrayList<>();
//        test.add(1);
//        test.add(2);
//        test.add(3);
//        test.add(4);
//        test.add(5);
//
//        test.forEach(System.out::println);
//


//        Consumer<String> javaninRuturnOlmayanInerfacei = name->{
//            System.out.println(name.toLowerCase());
//        };
//        javaninRuturnOlmayanInerfacei.accept("sesddsa");

        Predicate<String> test2 =(a)->{
            if (a.equals("kenan")){
                System.out.println("acssec");
            }
            else {
                System.out.println("wrong");
            }
            return false;
        };

        test2.test("kenan");














    }




}