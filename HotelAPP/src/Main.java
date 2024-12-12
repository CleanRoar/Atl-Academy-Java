import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        HotelAgency hotel =new HotelAgency("Ramada");
        Room otaq1 =new Room(1,"Gozel Divar",100.0,RoomType.STANDARD);
        Room otaq2 =new Room(2,"Ferrah Yasayis",150.0,RoomType.DELUX);
        Room otaq3 =new Room(3,"Dord Divar",200.0,RoomType.SUITE);

        otaq1.reserveRoom();
        otaq1.reserveRoom();
        otaq1.reserveCancelRoom();
        otaq1.reserveCancelRoom();
        System.out.println();

        hotel.addRoom(otaq1);
        hotel.addRoom(otaq2);
        hotel.addRoom(otaq3);
        System.out.println();

        Customer musteri1 =new Customer(Arrays.asList(otaq1),1);
        Customer musteri2 =new Customer(Arrays.asList(otaq1,otaq2),2);
        Customer musteri3 =new Customer(Arrays.asList(otaq3),3);


        hotel.addCustomer(musteri1);
        hotel.addCustomer(musteri2);
        hotel.addCustomer(musteri3);
        System.out.println();

        hotel.displayCustomersInfo();
        hotel.displayRoomsInfo();








    }
}