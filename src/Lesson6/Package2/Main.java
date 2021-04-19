package Lesson6.Package2;

public class Main {
    public static void main(String[] args) {
        Distance.Convertor convertor = new Distance.Convertor();

        System.out.println(convertor.fromMToKm(1321));
        System.out.println(convertor.fromKmToM(21));
    }
}
