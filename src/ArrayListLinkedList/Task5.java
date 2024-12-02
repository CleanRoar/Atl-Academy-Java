package ArrayListLinkedList;

import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        //LinkedList yaradın, 5 fərqli söz əlavə edin.
        //Yeni bir element siyahının əvvəlinə əlavə edin.
        //Başqa bir elementi siyahının sonuna əlavə edin.

        LinkedList<String> test =new LinkedList<>();
        test.add("bir");
        test.add("iki");
        test.add("uc");
        test.add("dord");
        test.add("bes");

        test.addFirst("Ilk");
        test.addLast("Son");
        System.out.println(test);


    }
}
