package TravelAPP;

public class Tour {
    private int tourID;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourID, String tourName, double price, TourPackage tourPackage) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = false;
        this.tourPackage = tourPackage;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }


    public void reserveTourPackage() {
        if (!isReserved) {
            System.out.println("Tur paketi rezerv olundu");
            isReserved = true;

        } else {
            System.out.println("Tur paketi onceden rezerv olunub . Artiq movcut deyil. ");
        }

    }

    public void canselTourPackage() {
        if (isReserved) {
            System.out.println("Tur paketi legv edildi");
            isReserved = false;
        } else {
            System.out.println("Tur paketi onceden rezerv olunmayib .");
        }
    }

    public void displayDetails() {
        System.out.println("Tour ID: " + tourID +
                ", Tour Name: " + tourName +
                ", Price: $" + price +
                ", Tour Package: " + tourPackage +
                ", Reserved: " + (isReserved ? "Yes" : "No"));


    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourID=" + tourID +
                ", tourName='" + tourName + '\'' +
                ", price=" + price +
                ", isReserved=" + isReserved +
                ", tourPackage=" + tourPackage +
                '}';
    }
}
