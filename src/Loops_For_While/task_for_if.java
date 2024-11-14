package Loops_For_While;

import java.util.Scanner;

public class task_for_if {
    public static void main(String[] args) {
        //Istenilen eded daxil edilsin ve onun nece reqemden ibaret oldugu cap edilsin .
        Scanner sc=new Scanner(System.in);
        System.out.println("Ededler daxil edin : ");
        var num =sc.nextInt();
        //Reqemlerin ardicil sayilmasi ucun 0-a deyeri verilir.
        var reqemlerinSayi =0;

        // Daxil edilen ededi 0-a beraber etmirik !.
        // Daxil edilen ededi 10-a bolub reqemleri aliriq.
        for (;num!=0; num/=10 ){
            //Her bolunmede reqemlerinSayi-ni bir vahid artiririq.
            reqemlerinSayi++;
        }
        System.out.println("Daxil edilen ededin reqemlerinin sayi : "+reqemlerinSayi);
    }






}
