package Lesson4.Package1;

public class Main {
    public static void main(String[] args) {
        AbstractHandle doc = new DOCHandle();
        AbstractHandle txt = new TXTHandle();
        AbstractHandle xml = new XMLHandle();

        doc.create();
        doc.open();
        doc.change();
        doc.save();

        txt.create();
        txt.open();
        txt.change();
        txt.save();

        xml.create();
        xml.open();
        xml.change();
        xml.save();
    }
}
