package TravelAPP;

public class Main {
    public static void main(String[] args) {
        Tour test =new Tour(1,"Gəz Gör Öl",20.0,TourPackage.BEACH_HOLIDAY);
        test.reserveTourPackage();

        test.canselTourPackage();
        test.canselTourPackage();
    }
}
