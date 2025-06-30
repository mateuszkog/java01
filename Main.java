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

    User user1 = new User("John", "Doe", "john.doe@example.com", 30);
    user1.setFirstName("HeniekXD");
    System.out.println("User's first name: " + user1.getFirstName());
    
    User user2 = new User();
    user2.setFirstName("Jane");
    user2.setLastName("Doe");
    user2.setEmail("jane.doe@example.com");
    user2.setAge(28);
    System.out.println("User's first name: " + user2.getFirstName());
    System.out.println("User's last name: " + user2.getLastName());
    System.out.println("User's email: " + user2.getEmail());
    System.out.println("User's age: " + user2.getAge());
  }


}