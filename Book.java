public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.yearPublished = 0;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    void printBook() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + this.yearPublished);
    }
}
