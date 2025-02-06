//package
package com.stringbuffer;

//importing
import java.util.Scanner;

//class
public class ArrayToString {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for the size of array
        int size = sc.nextInt();

        //creating array of string
        String[] str = new String[size];

        sc.nextLine();

        //taking input as string for array
        for (int i=0; i<size; i++){

            str[i]= sc.nextLine();

        }

        //creating string buffer object
        StringBuffer sb = new StringBuffer();

        //appending it in string builder
        for (int i=0; i<size; i++){

            sb.append(str[i]).append(" ");

        }

        //printing
        System.out.println(sb);
    }
}
