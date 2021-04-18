package Lesson3.Package3;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    void saveDocument() {
        System.out.println("Document saved in the old format, save other formats Expert");
    }

    @Override
    void editDocument() {
        System.out.println("Document is edited");
    }

}
