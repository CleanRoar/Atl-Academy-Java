package HotelOOP;

public    class Room {
    private int roomNuber;
    private double price;
    private boolean isBooked;
    private RoomType roomType;



    public Room(int roomNuber, double price ,RoomType roomType) {
        this.roomNuber = roomNuber;
        this.price = price;
        this.isBooked = true;
        this.roomType=roomType;// true veririk cunki otaq her zaman var bos otaq var .
                                // abstrack classin obyektini cagira bilmirik.
    }

    public int getRoomNuber() {
        return roomNuber;
    }

    public void setRoomNuber(int roomNuber) {
        this.roomNuber = roomNuber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }




    public  void displayInfo() {};  // abstract classin methodunun body-si olmur .

    public void Reserve(){
        if (isBooked){
            System.out.println("Otaq bos deyil, rezerv olunub.");
            isBooked=false;
        }
        else {

            System.out.println("Otaq bosdur ve rezerv olundu . ");
        }

    }


    public void CanselReserve(){
        if (!isBooked){
            isBooked=true;
            System.out.println("Sizin rezerv legv olundu .");
        }
        else {
            System.out.println("Rezerv olunmayib , otaq bosdur .");
        }
    }













    @Override
    public String toString() {
        return "Room{" +
                "roomNuber=" + roomNuber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }
}
