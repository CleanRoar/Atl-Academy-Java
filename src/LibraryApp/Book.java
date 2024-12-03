package LibraryApp;

import java.util.ArrayList;
import java.util.Objects;

public class Book {

    private String kitabAdi;
    private String muellif ;
    private boolean movcud;

    public Book(String kitabAdi, String muellif) {
        this.kitabAdi = kitabAdi;
        this.muellif = muellif;
        this.movcud = true;
    }

    public String getKitabAdi() {
        return kitabAdi;
    }

    public void setKitabAdi(String kitabAdi) {
        this.kitabAdi = kitabAdi;
    }

    public String getMuellif() {
        return muellif;
    }

    public void setMuellif(String muellif) {
        this.muellif = muellif;
    }

    public boolean isMovcud() {
        return movcud;
    }

    public void setMovcud(boolean movcud) {
        this.movcud = movcud;
    }

    @Override
    public String toString() {
        return "Book{" +
                "kitabAdi='" + kitabAdi + '\'' +
                ", muellif='" + muellif + '\'' +
                ", movcud=" + movcud +
                '}';
    }
}
