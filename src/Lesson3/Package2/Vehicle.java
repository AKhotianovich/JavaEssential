package Lesson3.Package2;

public class Vehicle {
    int x;
    int y;
    int price;
    int speed;
    int year;

    public Vehicle(int x, int y, int price, int speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    void method(){
        System.out.println(
                " X: " + x +
                " Y: " + y +
                " Price: " + price +
                " Speed: " + speed +
                " Year: " + year
        );
    }
}
