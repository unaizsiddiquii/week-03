// Main class of Round Robin Scheduler System
public class RoundRobinSchedulerSystem {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time quantum = 4 units

        // Add processes to the scheduler
        scheduler.addProcess(new Process(1, 10, 1)); // Process ID 1, Burst Time 10, Priority 1
        scheduler.addProcess(new Process(2, 5, 2));  // Process ID 2, Burst Time 5, Priority 2
        scheduler.addProcess(new Process(3, 8, 3));  // Process ID 3, Burst Time 8, Priority 3

        // Display all processes in the circular list
        System.out.println("Processes in the circular list:");
        scheduler.displayProcesses();

        // Schedule processes using round-robin scheduling
        System.out.println("Scheduling processes...");
        scheduler.schedule();

        // Calculate and display the average waiting time and turnaround time
        scheduler.calculateAverageTimes();
    }
}
