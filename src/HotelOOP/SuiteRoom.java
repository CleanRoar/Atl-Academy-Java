package HotelOOP;

public class SuiteRoom extends Room {

    private boolean isKitchen;

    public SuiteRoom(int roomNuber, double price, RoomType roomType) {
        super(roomNuber, price, roomType);
        this.isKitchen = isKitchen;
    }

    @Override
    public void displayInfo() {

        System.out.println("Otaq nomeri : "+getRoomNuber()+" | Otagin qiymeti : "+getPrice()+
                "  Metbex secimi  : "+
                (isKitchen? "Metbex var ":" Metbex yoxdur !!!"));

    }
}
