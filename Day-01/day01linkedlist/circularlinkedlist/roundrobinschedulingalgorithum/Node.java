package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithum;
// In Node class, each node will store a process and a pointer
// to the next node (forming a circular linked list).
public class Node {
    // Process object
    Process process;
    // next is used to point the next node
    Node next;
    // Constructor
   public Node(Process process) {
        this.process = process;
        this.next = null;
    }
}
