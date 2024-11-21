package OOP_VehicleInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike =new Bike();

        car.startEngine();
        car.stopEngine();

        System.out.println();

        bike.startEngine();
        bike.stopEngine();
    }
}
