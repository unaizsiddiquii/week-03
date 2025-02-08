//package
package com.binarysearch.firstlastoccurrence;

//class
public class FirstLastOccurrence {

    //function to find first and last occurrence
    public int[] search(int[] arr, int element) {

        //initializing result array
        int[] result = {-1, -1};

        //finding first occurrence
        result[0] = findFirstOccurrence(arr, element);

        //finding last occurrence
        result[1] = findLastOccurrence(arr, element);

        //return value
        return result;
    }

    //function to find first occurrence
    private int findFirstOccurrence(int[] arr, int element) {
        int left = 0, right = arr.length - 1;
        int firstOccurrence = -1;

        //binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                firstOccurrence = mid;
                right = mid - 1;
            } else if (arr[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //return value
        return firstOccurrence;
    }

    //function to find last occurrence
    private int findLastOccurrence(int[] arr, int element) {
        int left = 0, right = arr.length - 1;
        int lastOccurrence = -1;

        //binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                lastOccurrence = mid;
                left = mid + 1;
            } else if (arr[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //return value
        return lastOccurrence;
    }
}
