package Lesson4.Package1;

public class XMLHandle extends AbstractHandle{
    @Override
    void open() {
        System.out.println("Open XML");
    }

    @Override
    void create() {
        System.out.println("Create XML");
    }

    @Override
    void change() {
        System.out.println("Change XML");
    }

    @Override
    void save() {
        System.out.println("Save XML");
    }
}
