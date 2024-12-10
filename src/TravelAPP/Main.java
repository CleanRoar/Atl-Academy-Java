package TravelAPP;

import HotelOOP.RoomType;

public class Main {
    public static void main(String[] args) {
        Tour tur =new Tour(1,"Gece Sahilde Gunuz Qebirde ",20.0,TourPackage.BEACH_HOLIDAY);
        Tour tur2 =new Tour(1,"Dagdan Dereye Ordanda Qebire ",20.0,TourPackage.MOUNTAIN_ADVENTURE);
        Tour tur3 =new Tour(1,"Maskasiz Cernobil ",20.0,TourPackage.CITY_TOUR);




        TravelAgency sirket= new TravelAgency("Gəz Gör Öl");
        sirket.addTourAgancy(tur);
        sirket.addTourAgancy(tur2);
        sirket.addTourAgancy(tur3);

        sirket.displayAgencyInfo();

    }
}
