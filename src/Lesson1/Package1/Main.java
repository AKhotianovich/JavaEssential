package Lesson1.Package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = in.nextInt();
        System.out.println("Enter width: ");
        int width = in.nextInt();
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("S: " + rectangle.areaCalculator());
        System.out.println("P: " + rectangle.perimetrCalculator());
    }
}
