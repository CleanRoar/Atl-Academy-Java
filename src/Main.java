import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Human insan =new Human();
//        ArrayList<Human> test =new ArrayList<>();
//        LocalDate doguymGunu =LocalDate.of(2002,5,30);
//        test.add(new Human("Kenan", doguymGunu,22));
//        test.add(new Human("Kamran", doguymGunu,23));
//        test.add(new Human("Cavid", doguymGunu,18));
//        Map<String, Integer> test2 =new HashMap<>();
////
////        test.forEach((x)->{
////            if (x.getYas()>20){
////                System.out.println(x);
////            }
////        });
//
//        test.forEach((x)->{
//            test2.put(x.getName(), x.getYas());
//        });
//
//        System.out.println(test2);


        String ulduz ="*";
        String bosluq =" ";


        for (var i = 1; i <= 5; i++) {
            // Boşluqları çap edirik ki, ulduzlar mərkəzlənsin
            for (var j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // Boşluqları çap edirik
            }
            // Ulduzları çap edirik
            for (var k = 1; k <= (2 * i - 1); k++) {
                System.out.print(ulduz); // Ulduzları çap edirik
            }
            // Yeni sətrə keçirik
            System.out.println();
        }












        }














    }




