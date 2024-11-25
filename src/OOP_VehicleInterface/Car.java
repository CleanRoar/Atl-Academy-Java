package OOP_VehicleInterface;

public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Masinin Muheriki ise dusdu .");
    }

    @Override
    public void stopEngine() {
        System.out.println("Masinin Muheriki sonduruldu .");
    }

    @Override
    public void getFuelType() {
        System.out.println("Masinin enerji teminati : Benzindir ");
    }







}







