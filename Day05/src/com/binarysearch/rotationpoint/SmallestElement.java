//package
package com.binarysearch.rotationpoint;

//class
public class SmallestElement {

    //method
    public int rotationPoint(int[] arr){

        //initializing variables
        int left =0;
        int right = arr.length-1;

        //loop to perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            //checking if middle is greater than right
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        //returning
        return left+1;
    }

}
