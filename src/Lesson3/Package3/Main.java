package Lesson3.Package3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DocumentWorker user = new DocumentWorker();
        System.out.print("Enter key: ");
        String key = in.next();

        if (key.equals("pro")){
            user = new ProDocumentWorker();
        }
        if (key.equals("exp")){
            user = new ExpertDocumentWorker();
        }
        user.openDocument();
        user.editDocument();
        user.saveDocument();



    }
}
