package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence = "I Love Java";
        String sentence2 = "Everything is Awesome!!!";

        // split(bySomething) is a method of String that split string into multiple parts
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING METHOD
        // Yes, we need to tell what do we use while splitting, in this example space
        // WHAT DO I GET OUT OF IT
        // We get out String array
        String[] allWords = sentence.split(" ");
        String[] words = sentence2.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords));
        System.out.println("How many words do I have in this sentence ? :" + allWords.length);
        
        // How do I get the last word of the sentence using this array I got from String
        System.out.println("Last word in this sentence is " + allWords[allWords.length-1]);

        System.out.println("Arrays.toString(words) = " + Arrays.toString(words));
        System.out.println("Last word in this sentence is " + words[words.length-1]);
        
        // String sentence2
        // split by letter e
        String[] splitBy_e_Array = sentence2.split("e");
        System.out.println("Arrays.toString(splitBy_e_Array) = " + Arrays.toString(splitBy_e_Array));

        for (String eachPiece : splitBy_e_Array) {
            System.out.println("eachPiece = " + eachPiece);
        }
        
        

    }
}
