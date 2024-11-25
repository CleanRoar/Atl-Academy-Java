package OOP_VehicleInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike =new Bike();
        Vehicle tesla =new ElektrikCar();
        Car masin =new Car();

        car.startEngine();
        car.stopEngine();
        car.getFuelType();

        System.out.println();

        bike.startEngine();
        bike.stopEngine();
        bike.getFuelType();

        System.out.println();

        tesla.startEngine();
        tesla.stopEngine();
        tesla.getFuelType();










    }
}
