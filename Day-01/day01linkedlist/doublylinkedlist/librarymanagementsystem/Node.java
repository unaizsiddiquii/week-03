package day01linkedlist.doublylinkedlist.librarymanagementsystem;
// In Node class, Each node in the Doubly Linked List will store a
// Book object and pointers to the next and previous nodes
public class Node {
    // Book object to book details
    Book book;
    // next pointer to point to the next node
    Node next;
    // next pointer to point to the previous node
    Node prev;

    // Constructor of Node
    public Node(Book book) {
        this.book = book;
        this.next = null;
        this.prev = null;
    }
}
