package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student test1=new Student("Kenan",1);
        Student test2=new Student("Ali",4);
        Student test3=new Student("Veli",2);

        ArrayList<Student> list=new ArrayList<>();
        list.add(test1);
        list.add(test2);
        list.add(test3);
        System.out.println(list);
        System.out.println();

        Collections.sort(list,new IdComparator());
        System.out.println(list);
        System.out.println();

        Collections.sort(list,new NameComparator());
        System.out.println(list);







    }
}
