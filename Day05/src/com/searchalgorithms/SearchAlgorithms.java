//package
package com.searchalgorithms;

//class
public class SearchAlgorithms {

    //function to find first missing positive integer using linear search
    public int findFirstMissingPositive(int[] arr) {

        int n = arr.length;

        //place numbers in correct index
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                //swap arr[i] with arr[arr[i] - 1]
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        //find the first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        //if all numbers are in correct place, return next number
        return n + 1;
    }

    //function to find index of target using binary search
    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        //binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; //return index if found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //return value if not found
        return -1;
    }
}
