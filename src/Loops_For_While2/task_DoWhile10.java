package Loops_For_While2;

public class task_DoWhile10 {
    public static void main(String[] args) {
        int cem=0;
        int eded=1;
        do {             // do-nun mahiyeti while-de verilen serti oxumadan 1 defe emeliyati icra etmesidir .
            cem += eded;
            eded++;
        }
        while (eded<=10);
        System.out.println("1-den 10-a qeder ededlerin Cemi : "+ cem);

    }
}
