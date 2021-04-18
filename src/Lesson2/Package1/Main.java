package Lesson2.Package1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1990, "red");
        Car car2 = new Car(1995, "yellow");
        Car car3 = new Car(1999, "blue");

        System.out.println("Year: " + car1.getYear() + " Color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + " Color: " + car2.getColor());
        System.out.println("Year: " + car3.getYear() + " Color: " + car3.getColor());

    }
}
