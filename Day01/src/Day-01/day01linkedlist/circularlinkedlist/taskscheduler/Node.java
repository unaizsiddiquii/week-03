// In class Node, each node in the circular linked list will store a Task
// and will have a pointer to the next node.
public class Node {
    // Task object
    Task task;
    // next pointer to point to the next node
    Node next;

    // Constructor
   public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
