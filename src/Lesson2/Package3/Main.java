package Lesson2.Package3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1999);
        Car car3 = new Car(1998, 200);
        Car car4 = new Car(1997, 250, 1800);
        Car car5 = new Car(1996, 210, 2000, "red");

        System.out.println("Year: " + car1.getYear() + " Speed: " + car1.getSpeed() + " Wight: " + car1.getWight() + " Color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + " Speed: " + car2.getSpeed() + " Wight: " + car2.getWight() + " Color: " + car2.getColor());
        System.out.println("Year: " + car3.getYear() + " Speed: " + car3.getSpeed() + " Wight: " + car3.getWight() + " Color: " + car3.getColor());
        System.out.println("Year: " + car4.getYear() + " Speed: " + car4.getSpeed() + " Wight: " + car4.getWight() + " Color: " + car4.getColor());
        System.out.println("Year: " + car5.getYear() + " Speed: " + car5.getSpeed() + " Wight: " + car5.getWight() + " Color: " + car5.getColor());
    }
}
