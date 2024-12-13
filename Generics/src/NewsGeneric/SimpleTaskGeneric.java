package NewsGeneric;

public class SimpleTaskGeneric <T> {
    private T deyisen ;

    public SimpleTaskGeneric(T deyisen) {
        this.deyisen = deyisen;
    }

    public T getDeyisen() {
        return deyisen;
    }

    @Override
    public String toString() {
        return "SimpleTaskGeneric{" +
                "deyisen=" + deyisen +
                '}';
    }

    public static void main(String[] args) {
        SimpleTaskGeneric <String> test = new SimpleTaskGeneric<>("Java");
        SimpleTaskGeneric <Integer> test2 =new SimpleTaskGeneric<>(100);

        System.out.println(test+" "+test2);
    }
}
