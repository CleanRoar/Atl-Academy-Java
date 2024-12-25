package Practise;

public class Main {
    public static void main(String[] args) {

        Mekteb<String> mekteb =new Mekteb<>("2 nomreli Mekteb");
        Telebe a =new Telebe("kenan","musayev",123);
        Telebe b =new Telebe("kenan","musayev",123);
        Telebe c =new Telebe("kenan","musayev",123);
        mekteb.telebeAdd(a);
        mekteb.telebeAdd(b);
        mekteb.telebeAdd(c);

    }
}
