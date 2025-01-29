package day01linkedlist.doublylinkedlist.undoredofunctionalityfortexteditor;
// Class with name TextEditor for the purpose of performing the operations like
// Add a new text state at the end of the list every time the user types or performs an action.
// Implement the undo functionality (revert to the previous state).
// Implement the redo functionality (revert back to the next state after undo).
// Display the current state of the text.
// Limit the undo/redo history to a fixed size (e.g., last 10 states).
public class TextEditor {
    // Head and tail of the list
    private Node head;
    private Node tail;
    Node current;
    int historyLimit;
    int size;

    // Constructor
    public TextEditor(int historyLimit){
        this.head = null;
        this.tail = null;
        this.current = null;
        this.historyLimit = historyLimit;
        this.size = 0;
    }

    // Add a new text state at the end
    public void addTextState(String text) {
        TextState newTextState = new TextState(text);
        // Creating new node for adding newTextState
        Node newNode = new Node(newTextState);
        // if  no node present in the list then head
        // and tail points to the new node
        if (head == null) {
            // First state
            head = tail = current = newNode;
        }
        else {
            if (size == historyLimit) {
                // Remove the oldest state when history limit is reached
                head = head.next;
                head.prev = null;
                size--;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            // New state is the current state
            current = tail;
        }
        size++;
    }

    // Undo operation: Move to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.textState.textContent);
        } else {
            System.out.println("No previous state to undo");
        }
    }

    // Redo operation: Move to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.textState.textContent);
        } else {
            System.out.println("No next state to redo");
        }
    }

    // Display current text state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.textState.textContent);
        } else {
            System.out.println("No text state available");
        }
    }


}
