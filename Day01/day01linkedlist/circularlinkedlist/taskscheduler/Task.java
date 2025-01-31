// Class with name Task and its purpose is to represents a task with
// Task ID, Task Name, Priority, and Due Date
public class Task {
    // Attribute
    int taskId;
    String taskName;
    int priority;
    String dueDate;

    // Constructor
    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}
