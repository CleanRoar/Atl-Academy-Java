package LibraryApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Library bookList =new Library();
        bookList.addBook(new Book("Micro Java","Ali"));
        bookList.addBook(new Book("Yeddi Gozel","Nizami"));
        bookList.addBook(new Book("Mr.Robot","Kenan"));
        bookList.addBook(new Book("Spiderman","Stan lee"));

        bookList.icare("Micro java");
        bookList.icare("Micro java");
        System.out.println();
        bookList.movcutOlanKitablar();
        System.out.println();

        bookList.geriQaytar("Micro java");
        bookList.geriQaytar("Micro Java");
        System.out.println();
        bookList.movcutOlanKitablar();






    }

}
