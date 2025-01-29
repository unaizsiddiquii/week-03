package day01linkedlist.doublylinkedlist.moviemanagementsystem;
// In Node class, each node in the Doubly Linked List will represent a movie
public class Node {
    // Movie object to store movie details
    Movie movie;
    // next pointer to point to the next node
    Node next;
    // prev pointer to point to the previous node
    Node prev;

    // Constructor
    Node(Movie movie) {
        this.movie = movie;
        this.next = null;
        this.prev = null;
    }
}