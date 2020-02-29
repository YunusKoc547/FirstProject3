package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBBBBBBBCCRDDDDD";

        // Get the frequency and store into map
        Map<Character,Integer> charFreq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            // if we do not have the key yet, it means we are entering for the first time
            // the count of 1
            if (!charFreq.containsKey(currentChar)) {
                System.out.println("Enter for the first time " + currentChar);
                charFreq.put(currentChar,1);
            }else {
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
                System.out.println("Incrementing the count of " + currentChar + " by one and " +
                        "replacing old count " + charFreq.get(currentChar));
                // replacing the count value by incrementing existing value
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);
            }
        }
        System.out.println("charFreq = " + charFreq);
    }
}
