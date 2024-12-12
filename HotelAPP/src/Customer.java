import java.util.List;

public class Customer {

    private int cotomerID;
    private List<Room> customerRoomChoise;

    public Customer(List<Room> customerRoomChoise, int cotomerID) {
        this.customerRoomChoise = customerRoomChoise;
        this.cotomerID = cotomerID;
    }

    public int getCotomerID() {
        return cotomerID;
    }

    public void setCotomerID(int cotomerID) {
        this.cotomerID = cotomerID;
    }

    public List<Room> getCustomerRoomChoise() {
        return customerRoomChoise;
    }

    public void setCustomerRoomChoise(List<Room> customerRoomChoise) {
        this.customerRoomChoise = customerRoomChoise;
    }

    public void customerReserves(Room room){
        if (room.isRoomReserve()){
            System.out.println("Musteri  Otagi  rezerv etdi .");
            room.reserveRoom();
            customerRoomChoise.add(room);
        }
        else {
            System.out.println(" Otaqlar onceden rezerv olunub ");
        }
    }

    public void customerCancelReserves(Room room){
        if (customerRoomChoise.contains(room)){
            room.reserveCancelRoom();
            System.out.println("Musteri  Otagi  legv etdi .");
            room.reserveRoom();
            customerRoomChoise.remove(room);
        }
        else {
            System.out.println(" Otaqlar onceden rezerv olunmayib ");
        }
    }

    public void customerInfo(){
        System.out.println("Customer{" +
                "cotomerID=" + cotomerID +

                '}');
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cotomerID=" + cotomerID +
                ", customerRoomChoise=" + customerRoomChoise +
                '}';
    }
}
