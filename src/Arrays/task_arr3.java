package Arrays;

import java.util.Scanner;

public class task_arr3 {
    public static void main(String[] args) {
        //Task: Scanner ile uzunlugu 5 olan array yaz,ededlerin cem cap et ve ededi ortasin.(sum ve average).
        Scanner sc=new Scanner(System.in);
        int deyer[]=new int[5];
        int sum = 0;                 // sum ve average-i 0-a beraber edirik ,cunki forun icinde yazaciyiq.
        double average =0 ;

        for (var i=0; i<deyer.length; i++) {
            deyer[i] = sc.nextInt();
            sum += deyer[i];         // Her loopda sonraki deyer ile toplama isi gurub deyerlen cemini tapiriq.
            average=(double) sum/deyer.length; // average-i double eliyerek qaliqli neticenide goruruk .
                                               // ve ededlerin cemini sayina bolerek ededi ortani tapiriq.
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);
    }
}
