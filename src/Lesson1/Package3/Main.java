package Lesson1.Package3;

public class Main {
    public static void main(String[] args) {
        Computer[] mass = {
                new Computer(),
                new Computer(), 
                new Computer(), 
                new Computer(), 
                new Computer()
        };

        for (Computer car: mass) {
            System.out.println(car);
        }
    }
}
