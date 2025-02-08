//package name
package com.stringbuilder;

//importing classes
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

//remove duplicate class
public class RemoveDuplicates {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the String");
        String str = sc.nextLine();

        //making object of String builder class and passing string as argument for string
        StringBuilder sb = new StringBuilder(str);

        //creating hashset
        HashSet<Character> hm = new HashSet<>();

        //loop for saving data in hash set
        for (int i=0; i<sb.length(); i++){
            hm.add(sb.charAt(i));
        }

        //printing output
        System.out.println(hm);
    }
}
