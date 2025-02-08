//5. Selection Sort - Sort Exam Scores
//Problem Statement:
//A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
//Hint:
//Find the minimum element in the array.
//Swap it with the first unsorted element.
//Repeat the process for the remaining elements.


//importing scanner
import java.util.Scanner;

//class
public class SelectionSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of students
        System.out.println("Enter the number of students:");
        int totalStudents = sc.nextInt();

        //initializing array
        int[] examScores = new int[totalStudents];

        //taking input for the exam scores
        System.out.println("Enter the exam scores:");
        for (int i = 0; i < totalStudents; i++) {
            examScores[i] = sc.nextInt();
        }

        //applying selection sort
        for (int i = 0; i < totalStudents - 1; i++) {
            //finding the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < totalStudents; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            //swapping the minimum element with the first unsorted element
            int temp = examScores[minIndex];
            examScores[minIndex] = examScores[i];
            examScores[i] = temp;
        }

        //printing result
        System.out.println("Sorted exam scores:");
        for (int i = 0; i < totalStudents; i++) {
            System.out.print(examScores[i] + "  ");
        }

        //closing scanner
        sc.close();
    }
}