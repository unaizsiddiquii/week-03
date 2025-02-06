//package
package com.binarysearch.peakelement;

//importing
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //instance of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input for the size of the array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        //initializing the array
        int[] arr = new int[size];

        //taking input for the elements of the array
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //creating the instance of the Peak class
        Peak pk = new Peak();

        //finding the peak element
        int peakIndex = pk.peak(arr);

        //printing the result
        if (peakIndex != -1) {
            System.out.println("peak element is at index: " + peakIndex);
            System.out.println("peak element is: " + arr[peakIndex]);
        } else {
            System.out.println("peak element not");
        }

        //closing scanner
        sc.close();
    }
}