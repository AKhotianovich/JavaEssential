package Lesson1.Package4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        Scanner in = new Scanner(System.in);

        address.setIndex("A");
        address.setCountry("B");
        address.setCity("C");
        address.setStreet("D");
        address.setHouse("E");
        address.setApartment("F");

        System.out.println(
                        address.getIndex() + " " +
                        address.getCountry() + " " +
                        address.getCity() + " " +
                        address.getStreet() + " " +
                        address.getHouse() + " " +
                        address.getApartment()
        );
    }
}
