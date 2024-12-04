package LibraryApp;

import LibraryApp.Xetalar.IcaredeYoxdurVeyaVar;
import LibraryApp.Xetalar.YalnisKitabDaxilEtme;

public class Main {
    public static void main(String[] args) {

        Library bookList = new Library();
        bookList.addBook(new Book("Micro Java", "Ali"));
        bookList.addBook(new Book("Yeddi Gozel", "Nizami"));
        bookList.addBook(new Book("Mr.Robot", "Kenan"));
        bookList.addBook(new Book("Spiderman", "Stan lee"));
//
        bookList.icare("Micro java");
        System.out.println();
        bookList.movcutOlanKitablar();
        System.out.println();

        bookList.geriQaytar("Micro java");
        System.out.println();
        bookList.movcutOlanKitablar();
        System.out.println();



        try {
            bookList.geriQaytar("Micro java");
        } catch (IcaredeYoxdurVeyaVar | YalnisKitabDaxilEtme e) {
            System.out.println(e.getMessage());
        }


    }
}
