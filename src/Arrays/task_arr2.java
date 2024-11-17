package Arrays;

import java.util.Scanner;

public class task_arr2 {
    public static void main(String[] args) {
        //Task: Array scanner ile doldur sonra min ve max tapin.
        //ekrana min ve max cixarin.
        //arr uzunluq arr[5]
        Scanner sc=new Scanner(System.in);
        int deyer []=new int[5];        // Arrey-in uzunlugunu teyin edirik .

        for (var i=0; i<deyer.length; i++){
            deyer[i]=sc.nextInt();      // Arrey-in deyerlerini daxil etmek ucun loopda Scanner daxil edirik.
        }

        int min = deyer[0];             // Daxil edilen deyerlerden sonra min ve max-i,0-ci indexse beraber edirik.
        int max = deyer[0];             // Sonraki loopda her bir deyeri  min ve max-i ile muqayise edib .
                                        // Hansinin boyuk hansinin kicik oldugunu teyin edeceyik .

        for (var i= 0; i<deyer.length; i++){
            if (deyer[i] < min){        // deyer[0] < 1 meselen eger sert bu olsa min = 1 . Birinci dongude artiq biz
                                        // min-1 teyin etdik sonraki dongude yene yoxlanilir . 5<1 bu artiq yalnisdir
                                        // o zaman if icra olunmur ve min 1 olaraq qalir.
                min = deyer[i];
            }
            if (deyer[i] > max ){
                max = deyer[i];

            }

        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);



    }
}
