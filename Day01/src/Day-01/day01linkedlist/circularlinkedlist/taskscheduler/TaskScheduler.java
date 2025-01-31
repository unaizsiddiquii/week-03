// Class with name TaskScheduler for the purpose of performing the operations like
// Add a task at the beginning, end, or at a specific position in the circular list.
// Remove a task by Task ID.
// View the current task and move to the next task in the circular list.
// Display all tasks in the list starting from the head node.
// Search for a task by Priority.
public class TaskScheduler {
    Node head;
    Node tail;
    Node current;
    int size;

    // Constructor
    public TaskScheduler() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Add a task at the beginning
    public void addFirst(Task task) {
        // Create a new node
        Node newNode = new Node(task);
        // if  no node present in the list then head
        // and tail points to the new node
        // and newNode's next points to head
        if (head == null) {
            head = tail = current = newNode;
            // Circular link
            newNode.next = head;
        }
        // if node is present then
        // newNode's next points to head
        // and head points to newNode
        // and tail's next points to head
        else {
            newNode.next = head;
            head = newNode;
            // Maintaining circular link
            tail.next = head;
        }
        size++;
    }

    // Add a task at the end
    public void addAtEnd(Task task) {
        // Create a new node
        Node newNode = new Node(task);
        // if  no node present in the list then head
        // and tail points to the new node
        // and newNode's next points to head
        if (head == null) {
            head = tail = current = newNode;
            // Circular link
            newNode.next = head;
        }
        // if node is present then
        // tail's next points to newNode
        // and newNode's next points to head
        // and tail points to newNode
        else {
            tail.next = newNode;
            // Circular link
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    // Add a task at a specific position
    public void addAtPosition(Task task, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addFirst(task);
        } else if (position == size) {
            addAtEnd(task);
        } else {
            // Create a new node
            Node newNode = new Node(task);
            // currentNode points to head
            Node currentNode = head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }

    // Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        do {
            if (currentNode.task.taskId == taskId) {
                if (prevNode == null) {  // Removing the head node
                    head = head.next;
                    tail.next = head;  // Maintain circular link
                } else {
                    prevNode.next = currentNode.next;
                    if (currentNode == tail) {  // Update tail if needed
                        tail = prevNode;
                    }
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // Move to the next task in the list
    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
            System.out.println("Current task: " + current.task.taskName);
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        Node currentNode = head;
        do {
            System.out.println("Task ID: " + currentNode.task.taskId +
                    ", Task Name: " + currentNode.task.taskName +
                    ", Priority: " + currentNode.task.priority +
                    ", Due Date: " + currentNode.task.dueDate);
            currentNode = currentNode.next;
        } while (currentNode != head);
    }


    // Search for tasks by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        Node currentNode = head;
        boolean found = false;
        do {
            if (currentNode.task.priority == priority) {
                System.out.println("Task found: " + currentNode.task.taskName);
                found = true;
            }
            currentNode = currentNode.next;
        } while (currentNode != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}
