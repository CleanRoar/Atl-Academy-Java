package HotelOOP;

public class DeluxRoom extends  Room{

    private boolean isBalcony;

    public DeluxRoom(int roomNuber, double price, RoomType roomType) {
        super(roomNuber, price, roomType);
        this.isBalcony = isBalcony;
    }

    @Override
    public void displayInfo() {
        System.out.println("Otaq nomeri : "+getRoomNuber()+" | Otagin qiymeti : "+getPrice()+
                "  Balkon  secimi  : "+
                (isBalcony? " Balkon var ":" Balkon yoxdur !!!"));
    }
}
