//package
package com.linearsearch.searchword;

//importing
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //input for the number of sentences
        System.out.println("Enter the number of sentences");
        int sentence = sc.nextInt();

        //initializing the array of string datatype
        String [] str = new String[sentence];

        sc.nextLine();

        //loop to take input
        for (int i=0; i<sentence; i++){

            str[i]= sc.nextLine();

        }

        //taking input to search the word
        System.out.println("Enter the word to match in the String");

        String word = sc.nextLine();

        //making object of the class
        Search src = new Search();

        //calling the function and printing the return value
        System.out.println(src.wordInSentence(str, word));

        //closing scanner
        sc.close();

    }
}
