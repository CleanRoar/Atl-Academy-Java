package HotelOOP;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        var standard = new StandardRoom(2,100,);
//        var suite =new SuiteRoom(4,150);
//        var delux =new DeluxRoom(6,200);
//        delux.Reserve();
//
//        Room [] hotel ={standard,suite,delux};
//        for (Room i : hotel){
//            if (i.isBooked()){
//                i.displayInfo();
//            }
//        }
        Room hotel =new Room(1,100,RoomType.STANDARD);
        ArrayList<Room> list =new ArrayList<>();
        for (Room i : list){
            System.out.println(i);
        }



    }
}
