package HotelOOP;

public class StandardRoom extends  Room {

    private boolean isSingleBed;


    public StandardRoom(int roomNuber, double price, RoomType roomType) {
        super(roomNuber, price, roomType);
        this.isSingleBed = isSingleBed;
    }


    @Override
    public void displayInfo() {

        System.out.println("Otaq nomeri : "+getRoomNuber()+" | Otagin qiymeti : "+getPrice()+
                "  Yataq sayi : "+
                (isSingleBed? "Tek yataqlidir":"Cut yataqlidir"));

    }




}
