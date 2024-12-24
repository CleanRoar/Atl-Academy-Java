package GenericQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> list =new LinkedList<>();

        GnQueue.elave(list,2);
        GnQueue.elave(list,3);
        GnQueue.elave(list,4);


        GnQueue.bosdur(list);
        GnQueue.birinciNeseEle(list);
        GnQueue.butunList(list);

    }
}
