package Arrays;

import java.util.Scanner;

public class task_arr1 {
    public static void main(String[] args) {
        // Task: Array elementlerin scannerle daxil edin sonra onlari bir setirde cap edin
        // arr uzunlugu 5 olsun yeni array[5].

        Scanner sc = new Scanner(System.in);
        int[] deyer = new int[5];      //Arreyin uzunlugunu 5 teyin edirik .

        for (var i = 0; i < deyer.length; i++) {
            deyer[i] = sc.nextInt();   //Eger arrey degeri scaner ile daxil etmek isteyirikse
                                       //scaneri loopun icinde yazaraq deyerler daxil ede bilerik .
        }
        for (var i = 0; i < deyer.length; i++) {
                                       // Sout -u ise birinci for-da daxil etsek ,her neticeden sonraki tesdiqi gosterer
                                       // Ona gorede sout-u yeni bir loop-un icinde yeni bir deyerlerle cap edirik.
            System.out.print(deyer[i]);
        }
    }
}