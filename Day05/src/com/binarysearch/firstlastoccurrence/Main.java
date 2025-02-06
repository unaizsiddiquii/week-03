//package
package com.binarysearch.firstlastoccurrence;

//importing scanner
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing sorted array
        int[] arr = {2, 4, 4, 4, 5, 6, 7, 8, 8, 9};

        //initializing target element
        int element = 4;

        //creating the object of FirstLastOccurrence class
        FirstLastOccurrence flo = new FirstLastOccurrence();

        //calling the method and printing the return value
        int[] result = flo.search(arr, element);

        //displaying result
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);

    }
}
