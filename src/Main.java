import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        ArrayList<Integer> test =new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);

        int baslangicIndex=0;
        int sonIndex=test.size()-1;
        int ortaIndex =(baslangicIndex+sonIndex)/2;
        int n =1;


        while (baslangicIndex<=sonIndex){
            if (test.get(ortaIndex)==n){
                System.out.println("tapildi ilk :"+n);
                break;
            } else if (test.get(ortaIndex)<n) {
                baslangicIndex= ortaIndex +1;
                System.out.println("tapildi sag : "+n);
                break;

            }
            else {
                sonIndex= ortaIndex -1;
                System.out.println("tapildi sol:"+n);
                break;

            }



        }








    }
}
