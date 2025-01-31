// Main class of Student record management system
public class StudentRecordManagement {
    public static void main(String args[]){
        // object of StudentLinkedList class
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding new students at the beginning, end and specific position
        studentList.addFirst(99,"Muskan",20, "A");
        studentList.addLast(113,"Pragya",21,"A");
        studentList.addAtPosition(57,"Ravi",25,"B",2);

        // Print all the record
        System.out.println("All Student Records:");
        studentList.displayAll();

        // Search a student by Roll Number
        Student foundStudent = studentList.searchByRollNumber(113);
        if (foundStudent != null) {
            System.out.println(" Student Found: " + foundStudent.name);
        } else {
            System.out.println(" Student not found");
        }

        // Updating  grades of a student
        studentList.updateGrade(57, "A+");

        // Display all records after update
        System.out.println("All Student Records After Update:");
        studentList.displayAll();

        // Delete a student record
        studentList.deleteByRollNumber(113);

        // Display all records after deletion
        System.out.println("All Student Records After Deletion:");
        studentList.displayAll();

        // Add student at specific position
        studentList.addAtPosition(104, "David", 23, "B+", 2);

        // Display all records after adding at position
        System.out.println(" All Student Records After Adding at Position:");
        studentList.displayAll();

    }
}
