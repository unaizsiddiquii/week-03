//Problem Statement:
//A school maintains student marks in an array.
// Implement Bubble Sort to sort the student marks in ascending order.
//        Hint:
//Traverse through the array multiple times.
//Compare adjacent elements and swap if needed.
//Repeat the process until no swaps are required.

//import
import java.util.Scanner;

//class
public class BubbleSort {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //input for number of student
        System.out.println("Enter the number of students");
        int numberOfStudent = sc.nextInt();

        //initializing array
        int [] marks = new int[numberOfStudent];

        //taking input for the marks of the students
        for (int i =0; i<numberOfStudent; i++){
            marks[i] = sc.nextInt();
        }

        //applying bubble sort
        for (int i=0; i<numberOfStudent; i++){
            for (int j=0; j<numberOfStudent-(i+1); j++){
                if (marks[j]>marks[j+1]){
                    int temp = marks[j+1];
                    marks[j+1]= marks[j];
                    marks[j]= temp;
                }
            }
        }

        //printing sorted array
        for (int i=0; i<numberOfStudent; i++){
            System.out.print(marks[i]+ "  ");
        }

        //closing scanner
        sc.close();

    }
}
