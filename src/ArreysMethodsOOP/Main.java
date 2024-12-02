package ArreysMethodsOOP;

public class Main {
    public static void main(String[] args) {
        Methods test = new Methods();
        int[] arr= {1,2,3,4,5,6};
        String[] arr2= {"Dinozavr","Qargidali","Tesla","Albert"};

        test.tapMinMax(arr);
        System.out.println();

        test.alfabetArrey(arr2);
        System.out.println();

        test.checkArrey(arr,100);
        System.out.println();

        test.arreySumAvarege(arr);
        System.out.println();

        test.tersArrey(arr);
        System.out.println();
    }

}
