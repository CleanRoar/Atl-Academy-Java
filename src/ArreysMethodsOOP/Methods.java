package ArreysMethodsOOP;

import java.util.Arrays;

public class Methods {
    public void tapMinMax(int[] arrey) {
        int min = arrey[0];
        int max = arrey[0];

        for (var i = 0; i < arrey.length; i++) {
            if (arrey[i] > max) {
                max = arrey[i];
            }
            if (arrey[i] < min) {
                min = arrey[i];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Maxs : " + max);
    }

    public void alfabetArrey(String[] arrey) {
        Arrays.sort(arrey);
        System.out.println("Arreyin elifba sirasi ile duzulusu  : " + Arrays.toString(arrey));
    }

    public void checkArrey(int[] arrey, int num) {
        boolean a = false;
        for (var i = 0; i < arrey.length; i++) {
            if (arrey[i] == num) {
                a = true;
                break;
            }

        }
        if (a) {
            System.out.println("Bu eded Arreyde movcutdur .");
        } else {
            System.out.println("Bu eded Arreyde movcut deyil .");
        }

    }

    public void arreySumAvarege(int[] arrey) {
        int sum = 0;
        int avarege = 0;
        for (int num : arrey) {
            sum += num;
        }
        System.out.println("Arreyin ededlerin cemi : " + sum);
        System.out.println("Arreyin ededi ortasi : " + (sum / arrey.length));


    }

    public void tersArrey(int[] arrey) {
        for (int i = arrey.length - 1; i >= 0; i--) {
            System.out.println(arrey[i]);
        }
    }



}
