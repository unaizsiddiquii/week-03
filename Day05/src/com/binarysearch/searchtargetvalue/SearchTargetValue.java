/*
Binary Search Problem 3: Search for a Target Value in a 2D Sorted Matrix
Problem:
You are given a 2D matrix where each row is sorted in ascending order,
and the first element of each row is greater than the last element of the previous row.
Write a program that performs Binary Search to find a target value in the matrix.
If the value is found, return true. Otherwise, return false.
Approach:
Treat the matrix as a 1D array (flattened version).
Initialize left as 0 and right as rows * columns - 1.
Perform binary search:
Find the middle element index mid = (left + right) / 2.
Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
Compare the middle element with the target:
If it matches, return true.
If the target is smaller, search the left half by updating right = mid - 1.
If the target is larger, search the right half by updating left = mid + 1.
If the element is not found, return false.
*/

//package
package com.binarysearch.searchtargetvalue;

//class
public class SearchTargetValue {

    //function
    public Boolean search(int[][] arr, int element){

        //initializing variables
        int rows = arr.length;
        int cols = arr[0].length;
        int left = 0, right = rows * cols - 1;

        //binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midElement = arr[row][col];

            if (midElement == element) {
                return true;
            } else if (midElement < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //return value
        return false;
    }
}
