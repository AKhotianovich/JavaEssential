package Lesson3.Package3;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument() {
        System.out.println("Document saved in new format");
    }
}
