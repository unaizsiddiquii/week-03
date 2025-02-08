/*
Binary Search Problem 2: Find the Peak Element in an Array
Problem:
A peak element is an element that is greater than its neighbors.
Write a program that performs Binary Search to find a peak element in an array.
If there are multiple peak elements, return any one of them.
Approach:
Initialize left as 0 and right as n - 1.
Perform a binary search:
Find the middle element mid = (left + right) / 2.
If arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1], arr[mid] is a peak element.
If arr[mid] < arr[mid - 1], then search the left half, updating right = mid - 1.
If arr[mid] < arr[mid + 1], then search the right half, updating left = mid + 1.
Continue until a peak element is found.
*/


//package
package com.binarysearch.peakelement;

//class
public class Peak {

    //method
    public int peak(int[] arr) {

        //initializing variables
        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }
            // if mid is not peak search the left half
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // if both condition not matches then search the right half
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}