//package
package com.filereader;

//importing
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//class
public class ReadFileLineByLine {

    //main method
    public static void main(String[] args) throws IOException {

        //giving path to open file
        FileReader fileReader = new FileReader("C:\\Users\\admin\\OneDrive\\Desktop\\notepad++\\Week-03\\Day04\\src\\com\\filereader\\try.txt");

        //checking if the file is ready
        System.out.println(fileReader.ready());

        //saving the data of the file in the array of characters
        char[] array = new char[50];
        fileReader.read(array);

        //printing
        System.out.println("File content is "+String.valueOf(array));

        //releasing resourses
        fileReader.close();
    }
}
