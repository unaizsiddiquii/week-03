package day01linkedlist.doublylinkedlist.librarymanagementsystem;
// Main class for Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books at first,at end, at specific position
        library.addLast(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 101, true));
        library.addLast(new Book("1984", "George Orwell", "Dystopian", 102, true));
        library.addFirst(new Book("Moby-Dick", "Herman Melville", "Adventure", 103, true));
        library.addAtPosition(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 104, false), 2);

        // Display all books forward
        System.out.println("Books in the library (Forward):");
        library.displayForward();

        // Display all books backward
        System.out.println("Books in the library (Backward):");
        library.displayBackward();

        // Search for a book by title
        System.out.println("Searching for '1984':");
        library.searchByTitle("1984");

        // Search for books by author
        System.out.println("Searching for books by 'George Orwell':");
        library.searchByAuthor("George Orwell");

        // Update book availability
        library.updateAvailabilityByBookId(101, false);

        // Count total books
        System.out.println("Total number of books in the library: " + library.countBooks());

        // Remove a book by ID
        library.removeByBookId(103);

        // Display books after removal
        System.out.println("Books after removal:");
        library.displayForward();
    }
}
