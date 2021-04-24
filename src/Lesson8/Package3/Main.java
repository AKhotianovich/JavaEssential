package Lesson8.Package3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value_a, value_b;
        System.out.print("Input first value: ");
        value_a = in.nextInt();
        System.out.print("Input last value: ");
        value_b = in.nextInt();

        Calculator calculator = new Calculator(value_a, value_b);

        System.out.println("Enter number operation (+,-,*,/)");
        String operation = in.next();
        System.out.print("Result: ");
        switch (operation){
            case "+":
                System.out.println(calculator.add());
                break;
            case "-":
                System.out.println(calculator.sub());
                break;
            case "*":
                System.out.println(calculator.mul());
                break;
            case "/":
                System.out.println(calculator.div());
                break;
            default:
                System.out.println("Error!");
        }
    }

}
