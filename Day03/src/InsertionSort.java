//2. Insertion Sort - Sort Employee IDs
//        Problem Statement:
//        A company stores employee IDs in an unsorted array.
//        Implement Insertion Sort to sort the employee IDs in ascending order.
//        Hint:
//        Divide the array into sorted and unsorted parts.
//        Pick an element from the unsorted part and insert it into its correct position in
//        the sorted part.
//        Repeat for all elements.


//importing scanner
import java.util.Scanner;

//class
public class InsertionSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of employees
        System.out.println("Enter the number of employees");
        int totalEmployees = sc.nextInt();

        //initializing array
        int[] employeeID = new int[totalEmployees];

        //taking input for the employee id
        for (int i = 0; i < totalEmployees; i++) {
            employeeID[i] = sc.nextInt();
        }

        //applying insertion sort
        for (int i = 1; i < totalEmployees; i++) {
            int temp = employeeID[i];
            int j = i - 1;
            while (j >= 0 && employeeID[j] > temp) {
                employeeID[j + 1] = employeeID[j];
                j--;
            }
            employeeID[j + 1] = temp;
        }

        //printing result
        for (int i = 0; i < totalEmployees; i++) {
            System.out.print(employeeID[i] + "  ");
        }

        //closing scanner
        sc.close();
    }
}
