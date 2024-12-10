package TravelAPP;

public class Tour {
    private int tourID;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourID, String tourName, double price,  TourPackage tourPackage) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = true;
        this.tourPackage = tourPackage;
    }

    public  void displayInfo(){};

    public void reserveTourPackage(){
        if (isReserved){
            System.out.println("Tur paketi rezerv olundu");
            isReserved=false;

        }
        else {
            System.out.println("Tur paketi onceden rezerv olunub . Artiq movcut deyil. ");
        }

    }

    public void canselTourPackage(){
        if (!isReserved){
            System.out.println("Tur paketi legv edildi");
            isReserved=true;
        }
        else {
            System.out.println("Tur paketi onceden rezerv olunmayib .");
        }
    }
}
