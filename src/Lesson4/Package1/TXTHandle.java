package Lesson4.Package1;

public class TXTHandle extends AbstractHandle{
    @Override
    void open() {
        System.out.println("Open TXT");
    }

    @Override
    void create() {
        System.out.println("Create TXT");
    }

    @Override
    void change() {
        System.out.println("Change TXT");
    }

    @Override
    void save() {
        System.out.println("Save TXT");
    }
}
