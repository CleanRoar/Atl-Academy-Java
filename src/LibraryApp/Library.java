//package LibraryApp;
//
//import LibraryApp.Xetalar.IcaredeYoxdurVeyaVar;
//import LibraryApp.Xetalar.YalnisKitabDaxilEtme;
//
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.*;
//
//public class Library {
//
//    //Book clasini list yaradaraq add kimi methodlar yaradarq bir liste salacam .
//    private Set<Book> list;
//    private Map <String ,Set<Book>> list2;
//
//
//
//
//    // 2 Constraktor yaradiram cunki mainde cagirarken doldurmaq istemirem.
//    public Library() {
//        this.list = new HashSet<>();
//        this.list2 = new HashMap<>();
//    }
//
//
//    //Constraktorda listi yeni bir liste beraber edirik !
//
//
//
//    public void addBook(String genre, Book kitab) {
//        HashMap<String , String> book= new HashMap<>();
//        book.putIfAbsent();
//
//    }
//
//    public void movcutOlanKitablar() {
//        Set<Book> kitablar = list;
//        for (Book i : kitablar ) {
//            if (i.isMovcud()) {
//                System.out.println("Kitabin adi : " + i.getKitabAdi() + "  |   Kitabin Muellifi : " + i.getMuellif());
//            }
//        }
//    }
//
//
//    // Eger String basliq beraberdirse loopla siraladigim listin icindeki kitabin adina demek menim bu kitabim
//    // movcutdur o zaman onceden teyin etdiyim movcud boolean truedur . amma men kitabi icareye goturende kitab yene
//    // movcut olmamalidir axi ona gorede if-in daxilinde if acaraq yeni movcut boolean-i false edirem .
//
//    public void icare(String genre, String basliq) {
//        Set<Book> kitablar = list2.get(genre);
//        if (genre == null) {
//            throw new YalnisKitabDaxilEtme("Daxil etdiyiniz bu  Bolme : " + genre + " yoxdur .");
//        }
//        for (Book i: list) {
//
//            if (i.getKitabAdi().equalsIgnoreCase(basliq)) {
//                if (i.isMovcud()) {
//                    i.setMovcud(false);
//                    i.setGeriQaytarmaTarixi(LocalDate.now());
//                    Period period = Period.between(i.getIcareTarixi(), i.getGeriQaytarmaTarixi());
//                    System.out.println("Bu " + basliq + " kitab var ve icareye goturuldu . Kitabin goturulme tarixi :  " +
//                            i.getIcareTarixi());
//                } else {
//                    throw new IcaredeYoxdurVeyaVar("Bu " + basliq + " .");
//                }
//                return;
//            }
//            throw new YalnisKitabDaxilEtme("Kitab adini yalnis daxil etdin ");
//
//
//        }
//
////        public void geriQaytar(String genre , String basliq ){
////            Set<Book> kitablar2 = list2.get(genre);
////            if (kitablar == null) {
////                throw new YalnisKitabDaxilEtme("Daxil etdiyiniz bu  Bolme : " + genre + " yoxdur .");
////            }
////            for (Book i :list  ) {
////                if (i.getKitabAdi().equalsIgnoreCase(basliq)) {
////                    if (!i.isMovcud()) {
////                        i.setMovcud(true);
////                        i.setGeriQaytarmaTarixi(LocalDate.now());
////                        Period period = Period.between(i.getIcareTarixi(), i.getGeriQaytarmaTarixi());
////                        System.out.println("Bu " + basliq + " kitab icareden qaytarildi. Bu kitab bu qeder vaxt icarede " +
////                                "qaldi :" + i.getGeriQaytarmaTarixi());
////                    } else {
////                        throw new IcaredeYoxdurVeyaVar("Bu " + basliq + " kitab icarede deyil .");
////                    }
////                    return;
////                }
////                throw new YalnisKitabDaxilEtme("Kitab adini yalnis daxil etdin ");
////
////            }
////
////        }
//
//
//    }
//}
