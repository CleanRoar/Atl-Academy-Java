package TravelAPP;

import HotelOOP.RoomType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TravelAgency sirket =new TravelAgency("Gel Gor Ol");

        Tour tur =new Tour(1,"Gece Sahilde Gunuz Qebirde ",20.0,TourPackage.BEACH_HOLIDAY);
        Tour tur2 =new Tour(2,"Dagdan Dereye Ordanda Qebire ",30.0,TourPackage.MOUNTAIN_ADVENTURE);
        Tour tur3 =new Tour(3,"Maskasiz Cernobil ",40.0,TourPackage.CITY_TOUR);

        sirket.addTourAgancy(tur);
        sirket.addTourAgancy(tur2);
        sirket.addTourAgancy(tur3);
        sirket.displayTourAgencyInfo();
        System.out.println();
//

        Customer musteri =new Customer(1, Arrays.asList(tur));
        sirket.addCustomerAgancy(musteri);
        sirket.displayCustomerAgencyInfo();




    }
}
