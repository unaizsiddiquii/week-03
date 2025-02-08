//package
package com.stringbuffer;

//class
public class CompareStringBufferWithStringBuilder {

    //main method
    public static void main(String[] args) {

        //String buffer object
        StringBuffer sbuffer = new StringBuffer("Adarsh");

        //start time
        long startTimeBuffer = System.nanoTime();

        //iterating loop 1000000 times
        for (int i=0; i<1000000; i++){
            sbuffer.append("");
        }
        //end time
        long endTimeBuffer = System.nanoTime();

        //printing the time taken by string buffer
        System.out.println("Time taken by String buffer is "+(System.nanoTime()-endTimeBuffer));

        //string builder object
        StringBuilder sbuilder = new StringBuilder("Sakshi");

        //starting time
        long startTimeBuilder = System.nanoTime();

        //iterating loop 1000000 times
        for (int i=0; i<1000000; i++){
            sbuilder.append("");
        }
        //ending time
        long endTimeBuilder = System.nanoTime();

        //printing string builder time
        System.out.println("Time taken by String builder is "+(System.nanoTime()-endTimeBuilder));
    }
}
