package Lesson5.Package2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку
        // и увеличить значения на 1.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer integer = iterator.next() + 1;
            System.out.println(integer);
        }


    }
}
