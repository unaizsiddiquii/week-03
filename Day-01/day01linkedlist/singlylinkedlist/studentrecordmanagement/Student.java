package day01linkedlist.singlylinkedlist.studentrecordmanagement;
// Student class which is used to store details about the student
// including their Roll Number, Name, Age, and Grade
public class Student {
    // Attribute
    int rollNumber;
    String name;
    int age;
    String grade;
    // Here next will be used to point the object or
    // node of next student
    Student next;

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}