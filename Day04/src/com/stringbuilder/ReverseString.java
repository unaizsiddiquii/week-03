//Package name
package com.stringbuilder;

//importing scanner
import java.util.Scanner;

//class name
public class ReverseString {

    //main method
    public static void main(String[] args) {

        //scanner object
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the String");
        String str = sc.nextLine();

        //making object of String builder class and passing string as argument for string
        StringBuilder sb = new StringBuilder(str);

        //saving reversed string in string string builder
        StringBuilder rev = sb.reverse();


        //printing output
        System.out.println(rev);

        //closing scanner
        sc.close();
    }
}
