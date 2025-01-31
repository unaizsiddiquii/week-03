// Class with name RoundRobinScheduler used for the purpose of implement the following functionalities:
// Add a new process at the end of the circular list.
// Remove a process by Process ID after its execution.
// Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
// Display the list of processes in the circular queue after each round.
// Calculate and display the average waiting time and turn-around time for all processes.
public class RoundRobinScheduler {
    Node head;
    Node tail;
    Node current;
    int timeQuantum;
    int size;
    int totalWaitingTime;
    int totalTurnaroundTime;

    // Constructor
    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.timeQuantum = timeQuantum;
        this.size = 0;
        this.totalWaitingTime = 0;
        this.totalTurnaroundTime = 0;
    }

    // Add a new process to the end of the list
    public void addProcess(Process process) {
        Node newNode = new Node(process);
        if (head == null) {
            head = tail = current = newNode;
            newNode.next = head;  // Circular link
        } else {
            tail.next = newNode;
            newNode.next = head;  // Circular link
            tail = newNode;
        }
        size++;
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes in the scheduler");
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        do {
            if (currentNode.process.processId == processId) {
                if (prevNode == null) {
                    head = head.next;
                    tail.next = head;  // Circular link
                } else {
                    prevNode.next = currentNode.next;
                    if (currentNode == tail) {
                        tail = prevNode;
                    }
                }
                size--;
                System.out.println("Process " + processId + " has been removed.");
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        } while (currentNode != head);
        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate round-robin scheduling
    public void schedule() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        Node currentNode = head;
        int completedProcesses = 0;

        while (completedProcesses < size) {
            if (currentNode.process.remainingBurstTime > 0) {
                int executionTime = Math.min(currentNode.process.remainingBurstTime, timeQuantum);
                currentNode.process.remainingBurstTime -= executionTime;

                // Update waiting time and turnaround time
                totalWaitingTime += (currentNode.process.burstTime - currentNode.process.remainingBurstTime);
                totalTurnaroundTime += currentNode.process.burstTime;

                System.out.println("Process " + currentNode.process.processId + " executed for " + executionTime + " units.");
                if (currentNode.process.remainingBurstTime == 0) {
                    completedProcesses++;
                    removeProcess(currentNode.process.processId); // Remove process after execution
                }
            }

            currentNode = currentNode.next;
        }
        System.out.println("All processes have been completed.");
    }

    // Display all processes in the list starting from the head node
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }
        Node currentNode = head;
        do {
            System.out.println("Process ID: " + currentNode.process.processId +
                    ", Burst Time: " + currentNode.process.burstTime +
                    ", Remaining Burst Time: " + currentNode.process.remainingBurstTime +
                    ", Priority: " + currentNode.process.priority);
            currentNode = currentNode.next;
        } while (currentNode != head);
    }

    // Calculate and display average waiting time and turnaround time
    public void calculateAverageTimes() {
        if (size == 0) {
            System.out.println("No processes to calculate times.");
            return;
        }
        double averageWaitingTime = (double) totalWaitingTime / size;
        double averageTurnaroundTime = (double) totalTurnaroundTime / size;
        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

}
