package LibraryApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Book {

    private String kitabAdi;
    private String muellif ;
    private boolean movcud;
    private LocalDate icareTarixi;
    private LocalDate geriQaytarmaTarixi;

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

    public LocalDate getIcareTarixi() {
        return icareTarixi;
    }

    public void setIcareTarixi(LocalDate icareTarixi) {
        this.icareTarixi = icareTarixi;
    }

    public LocalDate getGeriQaytarmaTarixi() {
        return geriQaytarmaTarixi;
    }

    public void setGeriQaytarmaTarixi(LocalDate geriQaytarmaTarixi) {
        this.geriQaytarmaTarixi = geriQaytarmaTarixi;
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
