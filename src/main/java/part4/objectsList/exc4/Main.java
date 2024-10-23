package part4.objectsList.exc4;

import part4.objectsList.exc3.TelevisionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> booksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = String.valueOf(scanner.nextLine());
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            String pages = String.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Books books = new Books();
            books.setTitle(title);
            books.setPages(pages);
            books.setPublicationYear(publicationYear);
            booksList.add(books);
        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String info = String.valueOf(scanner.nextLine());

        for (Books book : booksList) {
            if ("name".equalsIgnoreCase(info)) {
                System.out.println(book.getTitle());
            }
            if ("everything".equalsIgnoreCase(info)) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        }
    }
}
