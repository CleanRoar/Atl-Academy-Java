package GenericQueue;

import java.util.Queue;

public class GnQueue {

    public static <T> void elave(Queue<T> queue, T a) {
        queue.add(a);
        System.out.println("Elave edildi ");
    }

    public static <T> void birinciNeseEle(Queue<T> queue){
        queue.poll();
        System.out.println("Birnci tapildi cixarildi . ");

    }


    public static <T> void bosdur(Queue<T> queue ){
        System.out.println(queue.isEmpty());

    }

    public static <T> void butunList(Queue<T> queue){
        for (T i : queue ){
            System.out.println("Butun list : "+i );
        }
    }


}



