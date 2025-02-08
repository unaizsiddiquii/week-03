//7. Counting Sort - Sort Student Ages
//Problem Statement:
//A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
//        Hint:
//Create a count array to store the frequency of each age.
//Compute cumulative frequencies to determine positions.
//Place elements in their correct positions in the output array.




//importing scanner
import java.util.Scanner;

//class
public class CountingSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of students
        System.out.println("Enter the number of students:");
        int totalStudents = sc.nextInt();

        //initializing array
        int[] studentAges = new int[totalStudents];

        //taking input for the student ages (ages range from 10 to 18)
        System.out.println("Enter the student ages (ages must be between 10 and 18):");
        for (int i = 0; i < totalStudents; i++) {
            studentAges[i] = sc.nextInt();
            //validate input (ages must be between 10 and 18)
            if (studentAges[i] < 10 || studentAges[i] > 18) {
                System.out.println("Invalid age! Ages must be between 10 and 18.");
                return; //exit the program if input is invalid
            }
        }

        //applying counting sort
        int[] sortedAges = countingSort(studentAges);

        //printing result
        System.out.println("Sorted student ages:");
        for (int i = 0; i < totalStudents; i++) {
            System.out.print(sortedAges[i] + "  ");
        }

        //closing scanner
        sc.close();
    }

    //method to perform counting sort
    public static int[] countingSort(int[] arr) {
        int n = arr.length;

        //find the range of ages (10 to 18)
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        //create a count array to store the frequency of each age
        int[] count = new int[range];

        //store the frequency of each age
        for (int i = 0; i < n; i++) {
            count[arr[i] - minAge]++;
        }

        //compute cumulative frequencies to determine positions
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        //create an output array to store the sorted ages
        int[] output = new int[n];

        //place elements in their correct positions in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - minAge] - 1] = arr[i];
            count[arr[i] - minAge]--;
        }

        //return the sorted array
        return output;
    }
}