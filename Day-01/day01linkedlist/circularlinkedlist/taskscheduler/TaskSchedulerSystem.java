package day01linkedlist.circularlinkedlist.taskscheduler;
// Main class for Task Scheduler System
public class TaskSchedulerSystem {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks to the scheduler
        scheduler.addAtEnd(new Task(1, "Task 1", 3, "2025-02-01"));
        scheduler.addAtEnd(new Task(2, "Task 2", 1, "2025-01-28"));
        scheduler.addFirst(new Task(3, "Task 3", 2, "2025-02-05"));
        scheduler.addAtPosition(new Task(4, "Task 4", 1, "2025-03-01"), 2);

        // Display all tasks
        System.out.println("All tasks in the scheduler:");
        scheduler.displayAllTasks();

        // Move to the next task
        scheduler.moveToNextTask();

        // Remove a task by Task ID
        scheduler.removeByTaskId(2);

        // Display all tasks after removal
        System.out.println("Tasks after removal of task ID 2:");
        scheduler.displayAllTasks();

        // Search for tasks by priority
        System.out.println("Searching for tasks with priority 1:");
        scheduler.searchByPriority(1);
    }
}
