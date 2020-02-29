package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding Word Frequency Sounds Fun, Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously" +
                "Do it and find out, Words Words Words";

        String[] allWords = str.split(" ");
        int wordCount = str.split(" ").length;
        System.out.println("allWords.length = " + allWords.length);

        // we want to solve this using the Map
        // because Map can only have unique key, so we can use it for unique words
        // first create Map object HarshMap implementation
        Map<String,Integer> wordFreMap = new HashMap<>();

        // Loop through word array
        for (String currentWord : allWords) {
            if (!wordFreMap.containsKey(currentWord)) {

                wordFreMap.put(currentWord,1);
            }else {
                int newCount = wordFreMap.get(currentWord) + 1;
                wordFreMap.replace(currentWord,newCount);
            }
        }
        System.out.println(wordFreMap);

        // Check if we already have the word in the key or not
        // If we do not have the key, it means we are entering for first time
        // so the count will be 1, add using put method
        // else it means we already have it in the key
        // so we get existing count using that key
        // and replace the old count value with new count value by incrementing by 1


    }
}
