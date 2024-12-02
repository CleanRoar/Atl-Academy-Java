package ArrayListLinkedList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Tapşırıq 2: Elementlərin axtarılması
        //ArrayList yaradın, istənilən 5 rəqəm əlavə edin.
        //Bir rəqəmin indeksini tapın (indexOf metodunu istifadə edin).

        ArrayList<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(42);
        test.add(12);
        test.add(19);
        test.add(24);

        System.out.println(test.indexOf(24)); // Bu ededin indexsi 4 dur.
    }
}
