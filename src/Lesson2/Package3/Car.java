package Lesson2.Package3;

public class Car {
    private int year;
    private double speed;
    private int wight;
    private String color;

    public Car(){
        this(1999, 200, 2000, "red");
    }

    public Car(int year) {
        this(year, 200, 2000, "red");
    }

    public Car(int year, double speed) {
        this(year, speed, 2000, "red");
    }

    public Car(int year, double speed, int wight) {
        this(year, speed, wight, "red");
    }

    public Car(int year, double speed, int wight, String color) {
        this.year = year;
        this.speed = speed;
        this.wight = wight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWight() {
        return wight;
    }

    public String getColor() {
        return color;
    }
}
