package OOP_VehicleInterface;

public class Bike implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Bike-in Muheriki ise dusdu .");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike-in Muheriki sonduruldu .");
    }

    @Override
    public void getFuelType() {
        System.out.println("Bike-in enerji teminati : Dizeldir. ");
    }

}

