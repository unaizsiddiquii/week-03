//package
package com.linearsearch.searchword;

//class
public class Search {

    //method
    public String wordInSentence(String str[], String word){

        //loop to traverse in array of strings
        for (int i=0; i< str.length; i++){

            //saving array for every words of the sentences of the array in the
            String[] words = str[i].split(" ");

            //comparing the word and the words in sentence
            for (int j=0; j<words.length; j++){
                if (words[j] .equals(word)){

                    //returning value
                    return str[i];
                }
            }
        }

        //returning if the word is not found in the sentence
        return "Word is not available in the sentences";
    }
}
