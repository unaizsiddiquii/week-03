package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithum;
// Class with name Process used for the purpose of represent
// a process and contain Process ID, Burst Time, and Priority
public class Process {
    // Attribute
    int processId;
    int burstTime;
    int remainingBurstTime;
    int priority;

    // Constructor
   public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingBurstTime = burstTime;
        this.priority = priority;
    }
}
