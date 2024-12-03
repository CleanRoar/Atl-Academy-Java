import OOP_BankAccount.BankAccount;

import java.security.Key;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.*;

import static javax.swing.UIManager.put;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       HashMap <String,String> test =new HashMap<>();

        test.put("20","Gence");
        test.put("51","Semkir");
        test.put("90","Baki");

        System.out.println(test.get("20"));

        System.out.println(test.containsValue("20"));

        for (String i : test.keySet()){
            System.out.println(i);
        }

        for (String i : test.values()){
            System.out.println(i);
        }






    }




}