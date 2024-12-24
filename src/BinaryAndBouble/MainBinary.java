package BinaryAndBouble;

import java.util.ArrayList;

public class MainBinary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(13);
        list.add(10);
//
//        int baslangicIndex = 0;
//        int sonIndex = main.size() - 1;
//
//        int n = 4;
//
//
//        while (baslangicIndex <= sonIndex) {
//             int ortaIndex = (baslangicIndex + sonIndex) / 2;
//            if (main.get(ortaIndex) == n) {
//                System.out.println("tapildi orta :" + main.get(ortaIndex));
//                break;
//            } else if (main.get(ortaIndex) > n) {
//                sonIndex = ortaIndex - 1;
//
//
//            } else {
//                baslangicIndex = ortaIndex + 1;
//            }
//
//
//        }





        System.out.println("Sıralanmamış siyahı: " + list);

        // Bubble Sort alqoritmi
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() -1; j++) {
                int temp = 0;
                if(list.get(j)>list.get(j+1)){
                    temp=list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }

        System.out.println("Sıralanmış siyahı: " + list);


    }
}
