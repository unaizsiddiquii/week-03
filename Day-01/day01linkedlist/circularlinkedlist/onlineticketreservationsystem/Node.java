package day01linkedlist.circularlinkedlist.onlineticketreservationsystem;
// In Node class, each node will represent a ticket
// and contain a reference to the next node in the circular linked list
public class Node {
    // object of Ticket class
    Ticket ticket;
    // next is used to point the next node
    Node next;

    // Constructor
    Node(Ticket ticket) {
        this.ticket = ticket;
        this.next = null;
    }
}
