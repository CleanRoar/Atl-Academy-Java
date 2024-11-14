package Loops_For_While;

import java.util.Scanner;

public class numberWithSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //10 ve 99 arasinda Iki reqemli eded daxil edilsin , ve o eded cap edildikde arasinda bosluq olsun.
        int num = sc.nextInt();

        int a = num/10; // daxil edilen iki reqemli ededin Onluq reqemini  tapiriq.
        int b =num%10;  // daxil edilen iki reqemli ededin Teklik reqemini tapiriq.

        //daxil edilen ededi hansi intervalda olmagini teyin edirik.
        if (num>=10 && (num<100) ) {
            //Son olaraq capda reqemler arasi bosluq dusdurunu yerine yetiririk.
            System.out.println(a+" "+b);
        }
        else {
            System.out.println("Xahiş olunur 10-99 arası bir ədəd daxil edin.");
        }

    }
}
