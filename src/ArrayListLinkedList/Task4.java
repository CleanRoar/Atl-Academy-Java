package ArrayListLinkedList;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        //Tərsinə çap edin
        //LinkedList yaradın, 5 rəqəm əlavə edin.
        //Elementləri tərsinə çap edin (sonuncudan birinciyə doğru).

        LinkedList <Integer> test =new LinkedList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

//        Collections.reverse(test);   Method olaraq Collections interfaci import ederek Collecgtions.reverse() methodu
//        System.out.println(test);    cagira bilerik.

        for (int i =test.size()-1 ; i>=0;i--){
            System.out.println(test.get(i));
        }






    }
}
