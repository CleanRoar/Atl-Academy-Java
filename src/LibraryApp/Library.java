package LibraryApp;

import LibraryApp.Xetalar.IcaredeYoxdurVeyaVar;
import LibraryApp.Xetalar.YalnisKitabDaxilEtme;

import java.util.ArrayList;

public class Library {

    //Book clasini list yaradaraq add kimi methodlar yaradarq bir liste salacam .
    private  ArrayList<Book> list;


    // 2 Constraktor yaradiram cunki mainde cagirarken doldurmaq istemirem.
    public Library(){
        this.list=new ArrayList<>();
    }



    //Constraktorda listi yeni bir liste beraber edirik !
    public  Library(Book list) {
        this.list = new ArrayList<>();
    }


    public void addBook(Book kitab){
        list.add(kitab);

    }

    public void movcutOlanKitablar (){
        for (Book i : list){
            if (i.isMovcud()){
                System.out.println("Kitabin adi : "+i.getKitabAdi()+"  |   Kitabin Muellifi : "+i.getMuellif());
            }
        }
    }


    // Eger String basliq beraberdirse loopla siraladigim listin icindeki kitabin adina demek menim bu kitabim
    // movcutdur o zaman onceden teyin etdiyim movcud boolean truedur . amma men kitabi icareye goturende kitab yene
    // movcut olmamalidir axi ona gorede if-in daxilinde if acaraq yeni movcut boolean-i false edirem .

    public void icare(String basliq) {
        for (Book i : list){
            if (basliq.equalsIgnoreCase(i.getKitabAdi())){
                if (i.isMovcud()){
                    i.setMovcud(false);
                    System.out.println("Bu "+basliq+" kitab var ve icareye verildi .");
                }
                else {
                    throw new IcaredeYoxdurVeyaVar("Bu "+basliq+" kitab icarededir .");
                }
                return;
            }
            else {
                throw new YalnisKitabDaxilEtme("Kitab adini yalnis daxil etdin  ");
            }
        }


    }

    public void geriQaytar(String basliq)  {
        for (Book i : list){
            if (i.getKitabAdi().equalsIgnoreCase(basliq)){
                if (!i.isMovcud()) {
                    i.setMovcud(true);
                    System.out.println("Bu "+basliq+" kitab icareden qaytarildi. ");
                }
                else {
                    throw new IcaredeYoxdurVeyaVar("Bu "+basliq+" kitab icarede deyil .");
                }
                return;
            }
            throw new YalnisKitabDaxilEtme("Kitab adini yalnis daxil etdin ");

        }

    }


}
