package part5.objectsAndReferences.exc8;

import part5.objectsAndReferences.exc7.Person;

import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        // if the values of the object variables are equal, the objects are equal
        Book b = (Book) compared;
//        boolean condition = this.getName().equals(b.getName()) && this.getPublicationYear() == b.getPublicationYear();
        boolean condition1 = this.name.equals(b.getName()) && this.publicationYear == b.getPublicationYear();

        if (condition1) {
//            System.out.println("condition1 : " + condition1);
            return true;
        }

        return false;
    }

}
