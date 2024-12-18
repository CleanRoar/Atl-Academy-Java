package GenericStream;

public class Main {
    public static void main(String[] args) {

        var a = new GenericMethod();

        a.test(new Integer[]{1, 2, 3, 4, 5, 6}, x -> x % 2 == 0);

        a.test(new String[]{"Kenan", "Ali", "Veli", "Deli"}, x -> x.startsWith("K"));

        a.test(new Double[]{1.0, 4.5, 6.8, 5.4}, x -> x > 2.0);
    }
}
