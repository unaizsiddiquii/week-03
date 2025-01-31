// Class with name Book and its purpose is to contain the following attributes:
// Book Title, Author, Genre, Book ID, and Availability Status
public class Book {
    // Attribute
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    // Constructor of Book
     public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }
}
