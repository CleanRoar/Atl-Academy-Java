import OOP_BankAccount.BankAccount;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tapşırıq 3: Elementləri silin
        //ArrayList yaradın, 7 element əlavə edin.
        //Üçüncü və beşinci elementləri silin.
        //Yerdə qalan siyahını çap edin.


        ArrayList<Integer> test = new ArrayList<>();

        for (var i =0 ; i<7;i++){
            test.add(i);
            System.out.println( test.get(i));
        }
        test.remove(3);
        test.remove(5);
        System.out.println(test);





    }
}