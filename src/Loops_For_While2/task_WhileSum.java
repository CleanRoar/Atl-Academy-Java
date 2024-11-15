package Loops_For_While2;

import java.util.Scanner;

public class task_WhileSum {
    public static void main(String[] args) {
        //Task : Sira ile ededler daxil edilir ve her daxil edilen ededlerin cemi tapilsin.
        //       Dongunu sonlandirmaq ucun ise "0" reqemi daxil edilsin .
        Scanner sc =new Scanner(System.in);
        System.out.println("Eded daxil edin (Dongunu sonlandirmaq ucun '0' daxil olun): ");
        int toplama =0; // Daxil edilen ededleri toplarken hesablama duzgun olsun deye '1' deyeri vererik.

        // while-e true deyeri verdik cunki bize sonsuz dongu lazimdir .
        while (true){
            int eded=sc.nextInt(); // sonsuz eded daxil etmek ucun int Scanner-i while-in icinde yaziriq.
            if (eded == 0){        // 0 yazarken sonlandirmaq ucun if ve onun icinde break kodunu giririk.
                break;
            }
            toplama+=eded;         // Misal: Daxil edilen eded=5 ; 0=0+5 . toplama her dongude ozunu qoruyur
                                   // ve hec vaxt sifirlanmir .
            System.out.println("Ededlerin Cemi : "+toplama);
        }
        System.out.println("Son netice : "+toplama);



    }
}
