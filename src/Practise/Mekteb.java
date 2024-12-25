package Practise;

import java.util.ArrayList;
import java.util.List;

public class Mekteb <T>{
    private T mektebAd;
    private List<Telebe> telebeler;

    public Mekteb(T mektebAd) {
        this.mektebAd = mektebAd;
        this.telebeler = new ArrayList<>();
    }

    public T getMektebAd() {
        return mektebAd;
    }

    public void setMektebAd(T mektebAd) {
        this.mektebAd = mektebAd;
    }

    public List<Telebe> getTelebeler() {
        return telebeler;
    }

    public void setTelebeler(List<Telebe> telebeler) {
        this.telebeler = telebeler;
    }


    public void telebeAdd(Telebe a){
        telebeler.add(a);
        System.out.println(a);
    }


}
