package NewsGeneric;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        News<String, Category, Author> test = new News<>("Java xeber", new Category<>("Java JDK"),
                new Author<>("Kenan", "Musayev"), LocalDate.now());

        test.xeberInfo();
        test.formatVaxt();


    }
}
