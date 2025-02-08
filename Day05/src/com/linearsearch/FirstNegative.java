//package
package com.linearsearch;

//import
import java.util.Scanner;

//class
public class FirstNegative {

    // Function to find the first negative number
    public static int findFirstNegative(int[] arr) {

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element is negative
            if (arr[i] < 0) {
                return i+1;
            }
        }
        return -1;
    }

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //size of array
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        //initializing array and taking elements of array as input
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println(findFirstNegative(arr));

        //closing scanner
        sc.close();
    }
}