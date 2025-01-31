//3. Merge Sort - Sort an Array of Book Prices
//Problem Statement:
//A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
//Hint:
//Divide the array into two halves recursively.
//Sort both halves individually.
//Merge the sorted halves by comparing elements.


//importing scanner
import java.util.Scanner;

//class
public class MergeSort {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the number of books
        System.out.println("Enter the number of books:");
        int totalBooks = sc.nextInt();

        //initializing array
        double[] bookPrices = new double[totalBooks];

        //taking input for the book prices
        System.out.println("Enter the book prices:");
        for (int i = 0; i < totalBooks; i++) {
            bookPrices[i] = sc.nextDouble();
        }

        //creating a temporary array for merging
        double[] temp = new double[totalBooks];

        //outer loop for dividing the array into subarrays of increasing size
        for (int size = 1; size < totalBooks; size *= 2) {
            //inner loop for merging subarrays
            for (int leftStart = 0; leftStart < totalBooks; leftStart += 2 * size) {
                //calculating mid and right end of the current subarray
                int mid = Math.min(leftStart + size - 1, totalBooks - 1);
                int rightEnd = Math.min(leftStart + 2 * size - 1, totalBooks - 1);

                //merging the two halves
                int i = leftStart;
                int j = mid + 1;
                int k = leftStart;

                //comparing elements from both halves and merging them
                while (i <= mid && j <= rightEnd) {
                    if (bookPrices[i] <= bookPrices[j]) {
                        temp[k] = bookPrices[i];
                        i++;
                    } else {
                        temp[k] = bookPrices[j];
                        j++;
                    }
                    k++;
                }

                //copying remaining elements of left subarray
                while (i <= mid) {
                    temp[k] = bookPrices[i];
                    i++;
                    k++;
                }

                //copying remaining elements of right subarray
                while (j <= rightEnd) {
                    temp[k] = bookPrices[j];
                    j++;
                    k++;
                }

                //copying the merged subarray back to the original array
                for (k = leftStart; k <= rightEnd; k++) {
                    bookPrices[k] = temp[k];
                }
            }
        }

        //printing result
        System.out.println("Sorted book prices:");
        for (int i = 0; i < totalBooks; i++) {
            System.out.print(bookPrices[i] + "  ");
        }

        //closing scanner
        sc.close();
    }
}