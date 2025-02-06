//package
package com.binarysearch.rotationpoint;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //initializing array
        int[] arr = {14, 17, 19, 22, 6, 8, 9, 11, 12};

        //making object of the smallest element class
        SmallestElement se = new SmallestElement();

        //calling rotation point method and printing its return value
        System.out.println(se.rotationPoint(arr));

    }
}