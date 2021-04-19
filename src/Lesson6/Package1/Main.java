package Lesson6.Package1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();

        vehicle.print();
        door.print();
        wheel.print();
    }
}
