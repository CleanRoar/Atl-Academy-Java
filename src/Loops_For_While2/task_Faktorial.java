package Loops_For_While2;

import java.util.Scanner;

public class task_Faktorial {
    public static void main(String[] args) {
        //Task : Sira ile ededler daxil edilir ve her daxil edilen ededlerin hasili tapilsin.
        //       Dongunu sonlandirmaq ucun ise "-1" reqemi daxil edilsin .
        Scanner sc =new Scanner(System.in);
        System.out.println("Eded daxil edin (Dongunu sonlandirmaq ucun '-1' daxil olun): ");
        int vurma =1; // Daxil edilen ededlerin hasili ucun bir int-e 1 deyerini veririk 0 deyerini vermirik
                      // Eks halda hasilimiz 0 olar .

        // while-e true deyeri verdik cunki bize sonsuz dongu lazimdir .
        while (true){
            int eded=sc.nextInt(); // sonsuz eded daxil etmek ucun int Scanner-i while-in icinde yaziriq.
            if (eded == -1){       //-1 yazarken sonlandirmaq ucun if ve onun icinde break kodunu giririk.
                break;
            }
            vurma=vurma*eded;      // Misal: Daxil edilen eded=5 ; 1=1*5 . vurma her dongude ozunu qoruyur
                                   // ve hec vaxt sifirlanmir .*/
            System.out.println("Hasil : "+vurma);
        }
        System.out.println("Son netice : "+vurma);



    }
}
