//package
package com.searchalgorithms;

//importing scanner
import java.util.Arrays;
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing list of integers
        int[] arr = {3, 4, -1, 1, 9, 2, 5};

        //initializing target element
        int target = 9;

        //creating the object of SearchAlgorithms class
        SearchAlgorithms sa = new SearchAlgorithms();

        //calling linear search function and printing result
        System.out.println("First Missing Positive: " + sa.findFirstMissingPositive(arr));

        //sorting the array for binary search
        Arrays.sort(arr);

        //calling binary search function and printing result
        System.out.println("Index of target " + target + ": " + sa.binarySearch(arr, target));

    }
}
