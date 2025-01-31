// In class Node, each node in the doubly linked list will hold a TextState
// object and pointers to the next and previous nodes
public class Node {
    // TextState object
    TextState textState;
    // next pointer to point to the next node
    Node next;
    // next pointer to point to the previous node
    Node prev;
    // Constructor
    public Node(TextState textState) {
        this.textState = textState;
        this.next = null;
        this.prev = null;
    }
}
