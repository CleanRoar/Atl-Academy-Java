package OOP_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        toplama a=new toplama();
        cixma b = new cixma();
        vurma c=new vurma();
        bolme d=new bolme();

        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin : ");
          int num = sc.nextInt();

        System.out.println("Ikinci ededi daxil edin : ");
          int num2 =sc.nextInt();

        System.out.println("Operator secin : ' + , - , * , / ,' ");
        String operator = sc.next();

          int netice= a.toplama(num ,num2);
          int netice2= b .cixma(num,num2);
          int netice3= c.vurma(num,num2);
          int netice4 =d.bolme(num,num2);



        if (operator.equals("+")){
            System.out.println(netice);
        } else if (operator.equals("-")) {
            System.out.println(netice2);
        } else if (operator.equals("*")) {
            System.out.println(netice3);
        } else if (operator.equals("/")) {
            if ((num!=0)&&(num2!=0)){
                System.out.println(netice4);
            }
            else {
                System.out.println("0-a bolme 0 olacaq .");
            }


        }
        else {
            System.out.println("Yalnis operator daxil etdiz .");
        }
    }


}
