package Lesson1.Package1;

public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double areaCalculator(){
        return height * width;
    }

    public double perimetrCalculator(){
        return height + width;
    }
}
