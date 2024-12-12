import java.util.ArrayList;
import java.util.List;

public class HotelAgency {
    private String hotelName;
    private List<Room> roomList;
    private List<Customer> customerList;

    public HotelAgency(String travelName) {
        this.hotelName = travelName;
        this.roomList = new ArrayList<>();
        this.customerList = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addRoom(Room room){
        roomList.add(room);
        System.out.println("Bu adli : "+room.getRoomName()+" Otaq liste elave edildi .");
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
        System.out.println("Bu ID-li :"+customer.getCotomerID()+ " Musteri liste elave edildi .");
    }

    public void displayRoomsInfo(){
        for (Room i: roomList){
            i.roomInfo();
        }
    }

    public void displayCustomersInfo(){
        for (Customer i: customerList){
            i.customerInfo();
        }
    }
}
