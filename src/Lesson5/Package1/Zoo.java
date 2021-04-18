package Lesson5.Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        // Создать класс Zoo. В классе создать список, в который записать 8 животных через
        // метод add(index, element).
        ArrayList<String> zoo = new ArrayList();

        String Animal;
        Scanner in = new Scanner(System.in);


        for (int i = 0; i <= 8; i++){
            Animal = in.nextLine();
            zoo.add(i, Animal);
        }

        System.out.println("--------------------------");

        for (String temp: zoo){
            System.out.println(temp);
        }
        // Используя класс Zoo, удалить 3,5,7 животные, узнать размер списка.
        System.out.println("--------------------------");

        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);
        System.out.print("Size: " + zoo.size());

        System.out.println("--------------------------");

        for (String temp: zoo){
            System.out.println(temp);
        }

    }

}
