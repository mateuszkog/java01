public class Book {
    private String title;
    private String author;
    private int yearPublished;

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
