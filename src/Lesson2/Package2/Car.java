package Lesson2.Package2;

public class Car {
    private int year;
    private double speed;
    private int wight;
    private String color;

    public Car() {}

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int wight) {
        this.year = year;
        this.speed = speed;
        this.wight = wight;
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
