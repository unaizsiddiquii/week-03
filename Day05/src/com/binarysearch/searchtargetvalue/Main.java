//package
package com.binarysearch.searchtargetvalue;

//importing scanner
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing 2de array
        int [][] arr = {{12, 13, 14, 15},{16, 17, 18, 19},{20, 21, 22, 23}};

        //initializing element to find the element
        int element= 25;

        //creating the object of search target value class
        SearchTargetValue stv = new SearchTargetValue();

        //calling the method and printing the return value
        System.out.println(stv.search(arr, element));

    }
}
