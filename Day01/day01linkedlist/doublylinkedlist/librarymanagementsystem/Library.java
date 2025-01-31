// Class with name Library  for the purpose of performing the operations like
// Add a new book at the beginning, end, or at a specific position.
// Remove a book by Book ID.
// Search for a book by Book Title or Author.
// Update a book’s Availability Status.
// Display all books in forward and reverse order.
// Count the total number of books in the library.
public class Library {
    // Head and tail of the list
    private Node head;
    private Node tail;
    // For tracking total number of book
    int size;

    // Constructor
    public Library(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Adding movie at the beginning
    public  void addFirst(Book book){
        // creating a  new node for adding book
        Node newNode = new Node(book);
        // if  no node present in the list then head
        // and tail points to the new node
        if(head==null){
            head=tail=newNode;
            return;
        }
        else {
            // new node's next will points to the head
            newNode.next = head;
            // head's prev will point to the newNode
            head.prev = newNode;
            // head point to the new node
            head = newNode;
        }
        size++;
    }

    // Add book at the end
    public void addLast(Book book) {
        // creating a  new node for adding book
        Node newNode = new Node(book);
        // if  no node present in the list then head
        // and tail points to the new node
        if (tail == null) {
            head = tail = newNode;
        } else {
            // tail's next will points to the newNode
            tail.next = newNode;
            // newNode's previous point to the tail
            newNode.prev = tail;
            // tail points the newNode
            tail = newNode;
        }
        size++;
    }

    // Add Book at a specific position
    public void addAtPosition(Book book, int position) {
        // creating a  new node for adding book
        Node newNode = new Node(book);
        if (position == 0) {
            addFirst(book);
            return;
        }
        // creating temp of Node type which is point to head
        Node temp = head;
        int index = 0;
        // iterate the loop util the index will be position-1
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            addLast(book);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            size++;
        }
    }

    // Remove a book by Book ID
    public void removeByBookId(int bookId) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            // if bookId is equal then
            // check current's previous is not equal to null
            // if this condition true then current's previous's next is point to
            // the current's next
            if (current.book.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                // if this condition false then head will point to
                // the current's next
                else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                // update size
                size--;
                return;
            }
            // update current
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found");
    }

    // Search books by title
    public void searchByTitle(String title) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            if (current.book.title.equalsIgnoreCase(title)) {
                System.out.println("Book found: " + current.book.title + " by " + current.book.author + ", Genre: " + current.book.genre + ", Availability: " + (current.book.isAvailable ? "Available" : "Not Available"));
            }
            current = current.next;
        }
    }


    // Search books by author
    public void searchByAuthor(String author) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            if (current.book.author.equalsIgnoreCase(author)) {
                System.out.println("Book found: " + current.book.title + " by " + current.book.author + ", Genre: " + current.book.genre + ", Availability: " + (current.book.isAvailable ? "Available" : "Not Available"));
            }
            current = current.next;
        }
    }

    // Update availability status by Book ID
    public void updateAvailabilityByBookId(int bookId, boolean availability) {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            if (current.book.bookId == bookId) {
                current.book.isAvailable = availability;
                System.out.println("Updated availability for book with ID " + bookId + " to " + (availability ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found");
    }

    // Display all books forward
    public void displayForward() {
        // Current will be the temporary variable which is points to the head
        Node current = head;
        // Iterate until the current not equal to null
        while (current != null) {
            System.out.println("Title: " + current.book.title + ", Author: " + current.book.author + ", Genre: " + current.book.genre + ", Availability: " + (current.book.isAvailable ? "Available" : "Not Available"));
            current = current.next;
        }
    }

    // Display all books backward
    public void displayBackward() {
        // Current will be the temporary variable which is points to the tail
        Node current = tail;
        // Iterate until the current not equal to null
        while (current != null) {
            System.out.println("Title: " + current.book.title + ", Author: " + current.book.author + ", Genre: " + current.book.genre + ", Availability: " + (current.book.isAvailable ? "Available" : "Not Available"));
            current = current.prev;
        }
    }

    // Count total number of books
    public int countBooks() {
        return size;
    }

}
