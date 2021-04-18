package Lesson2.Package4;


public class MyArea {
    private final static double PI_NUMBER = 3.14;
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double Ploschd() {
        return PI_NUMBER * radius * radius;
    }

}
