//4. Quick Sort - Sort Product Prices
//Problem Statement:
//An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
//Hint:
//Pick a pivot element (first, last, or random).
//Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
//Recursively apply Quick Sort on left and right partitions.



//importing scanner
import java.util.Scanner;

//class
public class QuickSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of products
        System.out.println("Enter the number of products:");
        int totalProducts = sc.nextInt();

        //initializing array
        double[] productPrices = new double[totalProducts];

        //taking input for the product prices
        System.out.println("Enter the product prices:");
        for (int i = 0; i < totalProducts; i++) {
            productPrices[i] = sc.nextDouble();
        }

        //applying quick sort
        quickSort(productPrices, 0, totalProducts - 1);

        //printing result
        System.out.println("Sorted product prices:");
        for (int i = 0; i < totalProducts; i++) {
            System.out.print(productPrices[i] + "  ");
        }

        //closing scanner
        sc.close();
    }

    //method to perform quick sort
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            //partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            //recursively sort the left partition
            quickSort(arr, low, pivotIndex - 1);

            //recursively sort the right partition
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    //method to partition the array
    public static int partition(double[] arr, int low, int high) {
        //choosing the last element as the pivot
        double pivot = arr[high];
        int i = low - 1; //index of the smaller element

        //traverse the array and move elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[high] (pivot)
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        //return the pivot index
        return i + 1;
    }
}