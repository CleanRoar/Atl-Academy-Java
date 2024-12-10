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

        Circus<String> test= new Circus<>();
        Circus<Integer> test2= new Circus<>();
        Circus<Double> test3= new Circus<>();
        test.add("Heyvanlar");
        test.add("1234dw");
        test.add("dfss");

        System.out.println(test);

        Circus<Scene> mainCircus = new Circus<>();
        mainCircus.add(new Scene("kenan",12,12));
        mainCircus.add(new Scene("addasa",3,20));
        mainCircus.add(new Scene("adasd",5,15));
        System.out.println(mainCircus);








    }




}