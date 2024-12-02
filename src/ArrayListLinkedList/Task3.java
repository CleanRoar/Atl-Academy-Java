package ArrayListLinkedList;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        //Müxtəlif əməliyyatlar
        //LinkedList yaradın, 6 rəqəm əlavə edin.
        //Siyahının ölçüsünü çap edin.
        //Siyahının ilk və son elementini çap edin.
        //contains() metodundan istifadə edərək 3 rəqəmin siyahıda olub-olmadığını yoxlayın.

        LinkedList<Integer> test =new LinkedList<>();
        test.add(10);
        test.add(66);
        test.add(123);
        test.add(567);
        test.add(42);
        test.add(6);
        System.out.println(test.size()); //Size 6-dir.
        System.out.println("Siyahinin ilk elementi : "+ test.getFirst()+ " | Siyahinin son elementi :"+test.getLast());

        System.out.println(test.contains(6)+"  "+test.contains(567)+"  "+test.contains(66)); //3 dene true cavabi .

    }


}
