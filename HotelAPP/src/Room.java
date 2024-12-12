public class Room {
    private int roomID;
    private String roomName;
    private double roomPrice;
    private boolean roomReserve;
    private RoomType roomType;

    public Room(int roomID, String roomName, double roomPrice, RoomType roomType) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomPrice = roomPrice;
        this.roomReserve = false;   // false veririk cunki , eger reserve gotururukse otaq bosdur .
        this.roomType = roomType;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isRoomReserve() {
        return roomReserve;
    }

    public void setRoomReserve(boolean roomReserve) {
        this.roomReserve = roomReserve;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }


    //
    public void reserveRoom(){
        if (roomReserve==false){
            System.out.println("Bu  otaq rezerv olundu .");
            roomReserve =true;
        }
        else {
            System.out.println("Bu otaq artiq reserv olunub .");
        }

    }
    public void reserveCancelRoom(){
        if (roomReserve){
            System.out.println("Bu  otaq rezervden cixarildi .");
            roomReserve =false;
        }
        else {
            System.out.println("Bu otaq onceden rezerv olunmayib.");
        }

    }

    public void roomInfo(){
        System.out.println(
                "Room{" +
                        "roomID=" + roomID +
                        ", roomName='" + roomName + '\'' +
                        ", roomPrice=" + roomPrice +
                        ", roomType=" + roomType +
                        '}'
        );
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", roomName='" + roomName + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomType=" + roomType +
                '}';
    }
}
