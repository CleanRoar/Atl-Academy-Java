package GenericQueue;

import java.util.Queue;

public class GnQueue<T> {

    public   void elave(Queue<T> queue, T a) {
        queue.add(a);
        System.out.println("Elave edildi ");
    }

    public   void birinciNeseEle(Queue<T> queue){
        queue.poll();
        System.out.println("Birnci tapildi cixarildi . ");

    }


    public   void bosdur(Queue<T> queue ){
        System.out.println(queue.isEmpty());

    }

    public void butunList(Queue<T> queue) {
        System.out.println("Bütün elementlər:");
        for (T i : queue) {
            System.out.println("- " + i);
        }
    }



}



