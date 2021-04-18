package Lesson3.Package2;

public class Plane extends Vehicle{
    private int height;
    private int passangers;
    public Plane(int x, int y, int price, int speed, int year, int passangers, int height) {
        super(x, y, price, speed, year);
        this.passangers = passangers;
        this.height = height;
    }

    @Override
    void method() {
        super.method();
        System.out.println(
                " Height: " + height +
                " Passangers: " + passangers
        );
    }
}
