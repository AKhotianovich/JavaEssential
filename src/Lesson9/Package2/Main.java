package Lesson9.Package2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Barsik", 14, true);
        Animal animal1 = animal;
        System.out.println(animal.toString());
        System.out.println("EQUALS: " + animal.equals(animal1));
        System.out.println("HC 1: " + animal.hashCode());
        System.out.println("HC 2: " + animal1.hashCode());
    }
}
