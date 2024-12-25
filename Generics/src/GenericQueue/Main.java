package GenericQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

       GnQueue<Integer> list =new GnQueue<>();

       Queue<Integer> queueList = new LinkedList<>();

        list.elave(queueList,1);
        list.elave(queueList,2);
        list.elave(queueList,3);

        list.birinciNeseEle(queueList);
        list.bosdur(queueList);
        list.butunList(queueList);
        System.out.println();


        GnQueue<String> list2 =new GnQueue<>();
        Queue<String> queueListStr = new LinkedList<>();

        list2.elave(queueListStr,"Kenan");
        list2.elave(queueListStr,"Ali");
        list2.elave(queueListStr,"Veli");

        list2.birinciNeseEle(queueListStr);
        list2.bosdur(queueListStr);
        list2.butunList(queueListStr);



    }
}
