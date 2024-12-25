package Practise;

import java.util.ArrayList;
import java.util.List;

public class Telebe {
    private String telebeAd;
    private String telebeSoyad;
    private int finCode;
    private ArrayList list;


    public Telebe(String telebeAd, String telebeSoyad, int finCode) {
        this.telebeAd = telebeAd;
        this.telebeSoyad = telebeSoyad;
        this.finCode = finCode;
        this.list = new ArrayList<>();
    }

    public String getTelebeAd() {
        return telebeAd;
    }

    public void setTelebeAd(String telebeAd) {
        this.telebeAd = telebeAd;
    }

    public String getTelebeSoyad() {
        return telebeSoyad;
    }

    public void setTelebeSoyad(String telebeSoyad) {
        this.telebeSoyad = telebeSoyad;
    }

    public int getFinCode() {
        return finCode;
    }

    public void setFinCode(int finCode) {
        this.finCode = finCode;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "telebeAd='" + telebeAd + '\'' +
                ", telebeSoyad='" + telebeSoyad + '\'' +
                ", finCode=" + finCode +
                '}';
    }




}
