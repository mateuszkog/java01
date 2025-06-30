public class Main {


  public static void main(String[] args) {
    Book book1 = new Book();
    Book book2 = new Book();

    book1.setTitle("Hobbit");
    book1.setAuthor("J.R.R. Tolkien");

    book2.setTitle("Harry Potter and the Philosopher's Stone");
    book2.setAuthor("J.K. Rowling");

    book1.printBook();
    book2.printBook();

    Book book = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle", 1854);
    book.printBook();
  }


}