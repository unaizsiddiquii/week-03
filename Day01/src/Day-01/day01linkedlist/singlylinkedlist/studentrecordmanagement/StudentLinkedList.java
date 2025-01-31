// Class with name StudentLinkedList  for the purpose of performing the operations like
// adding a new student (at beginning, end, or at a specific position),Delete a student record by Roll Number,
//Search for a student record by Roll Number,
//Display all student records,
//Update a student's grade based on their Roll Number.
public class StudentLinkedList {
    // Head and tail of the list
    private Student head;
    private Student tail;

    // Constructor
    public StudentLinkedList(){
        head = null;
    }

    // Adding a new student's details at the beginning
    public  void addFirst(int rollNumber, String name, int age, String grade){
        // creating a node for new student
        Student newStudent = new Student(rollNumber, name, age,grade);
        // if  no node present in the list then head
        // and tail points to the new node i.e newStudent
        if(head==null){
            head=tail=newStudent;
            return;
        }
        // new node's next will points to the head
        newStudent.next = head;
        // head point to the new node
        head = newStudent;
    }

    // Adding a new Student's details at the end
    public void addLast(int rollNumber, String name, int age, String grade){
        // creating a node for new student
        Student newStudent = new Student(rollNumber, name, age,grade);
        // if  no node present in the list then head
        // and tail points to the new node i.e newStudent
        if(head==null){
            head=tail=newStudent;
            return;
        }
        // tail's next will points the new node
        tail.next = newStudent;
        // tail point to the new node
        tail = newStudent;
    }

    // Adding a new Student's details at a specific position
    public void addAtPosition(int rollNumber, String name, int age, String grade,int position){
        if(position < 1){
            System.out.println("Invalid position");
        }
        // creating a node for new student
        Student newStudent = new Student(rollNumber, name, age,grade);
        if(position == 1){
            addFirst(rollNumber, name, age, grade);
            return;
        }
        // creating temp of Student type which is point to head
        Student temp = head;
        int i = 1;
        // iterate the loop util the i will be position-1
        while(temp != null && i < position-1){
            temp = temp.next;
            i++;
        }
        // Check temp is null or not if yes then print index out of bound
        // else new node's next points the next of temp and temp's next
        // point the new node i.e newStudent

        if(temp == null){
            System.out.println("Index of position out of bound");
        }
        else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
    }

    // Delete a student detail by rollNumber
    public void deleteByRollNumber(int rollNumber){
        // Check if the head is null or not
        if(head == null){
            System.out.println(" Empty list ");
        }
        // Check rollNumber is match with the head's rollNumber or not
        if(head.rollNumber == rollNumber)
        {
            head = head.next;
            return;
        }
        Student current = head;
        while(current.next != null && current.next.rollNumber != rollNumber){
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Search for a student record by roll number
    public Student searchByRollNumber(int rollNumber){
        Student temp = head;
        while(temp != null){
            // rollNumber is found
            if(temp.rollNumber == rollNumber){
                return temp;
            }
            temp = temp.next;
        }
        // rollNumber is not found
        return null;
    }

    // Display the records of all the student
    public void displayAll(){
        if(head == null){
            System.out.println("No student records available");
            return;
        }
        Student temp = head;
        while(temp != null){
            System.out.println("Roll Number : " +temp.rollNumber+ ", Name : " +temp.name+ ", Age : " +temp.age+ ", Grade " +temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade by their roll number
    public void updateGrade(int rollNumber, String newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated for roll number " + rollNumber);
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found");
        }
    }

}