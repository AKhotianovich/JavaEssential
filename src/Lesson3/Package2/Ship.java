package Lesson3.Package2;

public class Ship extends Vehicle{
    private int passangers;
    private String port;

    public Ship(int x, int y, int price, int speed, int year, int passangers, String port) {
        super(x, y, price, speed, year);
        this.passangers = passangers;
        this.port = port;
    }

    @Override
    void method() {
        super.method();
        System.out.println(
                " Passangers: " + passangers +
                " Port: " + port
        );
    }
}
