//6. Heap Sort - Sort Job Applicants by Salary
//Problem Statement:
//A company receives job applications with different expected salary demands.
// Implement Heap Sort to sort these salary demands in ascending order.
//        Hint:
//Build a Max Heap from the array.
//Extract the largest element (root) and place it at the end.
//Reheapify the remaining elements and repeat until sorted.



//importing scanner
import java.util.Scanner;

//class
public class HeapSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of job applicants
        System.out.println("Enter the number of job applicants:");
        int totalApplicants = sc.nextInt();

        //initializing array
        int[] salaries = new int[totalApplicants];

        //taking input for the salary demands
        System.out.println("Enter the salary demands:");
        for (int i = 0; i < totalApplicants; i++) {
            salaries[i] = sc.nextInt();
        }

        //applying heap sort
        heapSort(salaries);

        //printing result
        System.out.println("Sorted salary demands:");
        for (int i = 0; i < totalApplicants; i++) {
            System.out.print(salaries[i] + "  ");
        }

        //closing scanner
        sc.close();
    }

    //method to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        //build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        //extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            //swap the root (largest element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    //method to heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; //initialize largest as root
        int left = 2 * i + 1; //left child
        int right = 2 * i + 2; //right child

        //if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        //if right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        //if largest is not root
        if (largest != i) {
            //swap arr[i] and arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            //recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}