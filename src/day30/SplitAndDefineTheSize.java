package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        String sentence = "I love Java Java Java";

        // Split method has two versions :
        // first split by some separator and get whatever count of item we get from the result
        // second version : accept 2 external data,
        // one is the separator another is the limit of your array size
        // so if you have 5 words in a sentence if u split by space and put the limit for 2
        // then you will get an array with size of 2 --->> {first word, rest of the sentence}

        String[] wordsArray1 = sentence.split(" ",1);  // useless limit, already the default
        String[] wordsArray2 = sentence.split(" ",2);
        String[] wordsArray3 = sentence.split(" ",3);
        String[] wordsArray4 = sentence.split(" ",4);
        String[] wordsArray5 = sentence.split(" ",5);
        String[] wordsArray6 = sentence.split(" ",5);

        System.out.println("WordsArray = " + Arrays.toString(wordsArray1));
        System.out.println("WordsArray = " + Arrays.toString(wordsArray2));
        System.out.println("WordsArray = " + Arrays.toString(wordsArray3));
        System.out.println("WordsArray = " + Arrays.toString(wordsArray4));
        System.out.println("WordsArray = " + Arrays.toString(wordsArray5));
        System.out.println("WordsArray = " + Arrays.toString(wordsArray6));
    }
}
