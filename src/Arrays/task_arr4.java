package Arrays;

import java.util.Scanner;

public class task_arr4 {
    public static void main(String[] args) {
        // Array doldurursunuz scanner ile,user den bir eded isteyirsiz hemin ededin array de nece defe tekrarlandigini tapirsiniz.
        //uzunlugu 5 olsun.arr[5]
        //Enter a number to count: 2
        //The number 2 appears 1 times.
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Uzunlugu 5 olan Arrey ucun ededler daxil edin : ");
        for (var i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();              // Burada arr-in deyerleri artiq daxil edilir.
        }

        System.out.println("Eded daxil et ve nece defe tekrar olundugu gor : ");
        int eyniEded=sc.nextInt();            // Yeni bir scanner acilir eyni olan ededi daxil etmek ucun.

        int tekrarSayi=0;                     // Tekrarsayini bilmek ve artirmaq ucun bir int yaradiriq ve ona 0 veririk

        for (var i=0; i<arr.length; i++){
            if (eyniEded == arr[i]){          // Eger ikinci scannerdeki eded arr-in icindeki deyerle eynidirse ,
                tekrarSayi++;                 // i-miz 0 oldugu ucun bir vahid artir ve capde goster ki,
            }                                 // bu ededden 1 dene var.
        }
        System.out.println("Tekrarsayi : "+tekrarSayi);






        }
}
