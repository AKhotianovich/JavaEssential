package Lesson6.Package3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.sum(1, 2));
        System.out.println("Raz: " + calculator.raz(8, 2));
        System.out.println("Umn: " + calculator.umn(2, 5));
        System.out.println("Del: " + calculator.del(22, 11));
    }
}
