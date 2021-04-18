package Lesson1.Package2;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        String title;
        String author;
        String content;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = in.nextLine();
        System.out.print("Enter author: ");
        author = in.nextLine();
        System.out.print("Enter content: ");
        content = in.nextLine();

        Title title1 = new Title(title);
        Author author1 = new Author(author);
        Content content1 = new Content(content);

        System.out.println("---------------------------------------------");
        System.out.print("Enter title: ");
        title1.show();
        System.out.print("Enter author: ");
        author1.show();
        System.out.print("Enter content: ");
        content1.show();




    }
}
