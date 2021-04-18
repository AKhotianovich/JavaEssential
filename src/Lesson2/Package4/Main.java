package Lesson2.Package4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArea circle = new MyArea();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = in.nextInt();
        circle.setRadius(radius);
        System.out.println("S= " + circle.Ploschd());
    }
}
