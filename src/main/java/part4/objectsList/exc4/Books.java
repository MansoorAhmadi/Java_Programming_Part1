package part4.objectsList.exc4;

public class Books {
    private String title;
    private String pages;
    private int publicationYear;

//    public Books(String name, String pages, int publicationYear) {
//        this.title = name;
//        this.pages = pages;
//        this.publicationYear = publicationYear;
//    }

    public String getTitle() {
        return title;
    }

    public String getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    //    @Override
//    public String toString() {
//        return this.title + ", " + this.pages + ", " + this.publicationYear + " ";
//    }
}
