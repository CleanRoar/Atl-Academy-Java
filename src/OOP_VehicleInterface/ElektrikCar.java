package OOP_VehicleInterface;

public class ElektrikCar implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Elektirikli Masinin Muheriki ise dusdu .");
    }

    @Override
    public void stopEngine() {
        System.out.println("Elektrikli Masinin Muheriki sonduruldu .");
    }

    @Override
    public void getFuelType() {
        System.out.println("Elektrikli Masinin enerji teminati :  Elektrikdir. ");
    }
}
