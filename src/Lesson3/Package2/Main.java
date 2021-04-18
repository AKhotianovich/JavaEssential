package Lesson3.Package2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 1, 10000, 200, 1999);
        Ship ship = new Ship(30, 30, 10000000, 90, 2003, 700, "New York");
        Plane plane = new Plane(20, 20, 100000000, 1000, 2008, 60, 10000);

        car.method();
        System.out.println("-----------------------------------------");
        ship.method();
        System.out.println("-----------------------------------------");
        plane.method();
    }
}
