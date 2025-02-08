//package
package com.filereader;

//importing
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

//class
public class FileReaderCount {

    //main method
    public static void main(String[] args) throws IOException {

        //file reader object
        FileReader fr = new FileReader("C:\\Users\\admin\\OneDrive\\Desktop\\notepad++\\Week-03\\Day04\\src\\com\\filereader\\read.txt");

        //buffer reader object
        BufferedReader br = new BufferedReader(fr);


        //initializing variables
        int count =0;
        String target="this";
        String str;

        //counting the repetation of words
        while ((str = br.readLine())!=null){
           String[] word=str.split(" ");
           for(int i=0;i<word.length;i++){
               if(word[i].equals(target)){
                   count++;
               }
           }
        }
        //printing
        System.out.println(" The word "+target+" is coming "+count+ " times");

    }
}
