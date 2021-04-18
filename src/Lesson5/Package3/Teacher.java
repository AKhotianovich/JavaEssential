package Lesson5.Package3;

import java.util.ArrayList;

public class Teacher {
    public static void main(String[] args) {

        //Создать класс, в нем создать список, добавить учителей, которых вы только сожете вспомнить
        // со школы. И получить индекс самого лучшего учителя и самого не очень.

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Елена Павловна");
        teachers.add("Татьяна Ивановна");
        teachers.add("Елена Михайловна");
        teachers.add("Галина Николаевна");

        System.out.println("Лучший учитель: " + teachers.indexOf("Елена Павловна"));
        System.out.println("Худший учитель: " + teachers.indexOf("Галина Николаевна"));

    }
}
