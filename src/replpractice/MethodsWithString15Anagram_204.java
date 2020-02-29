package replpractice;

import java.util.Arrays;

public class MethodsWithString15Anagram_204 {

    public static boolean isAnagram(String word1, String word2) {
        char[] charWord1 = word1.toLowerCase().toCharArray();
        char[] charWord2 = word2.toLowerCase().toCharArray();
        Arrays.sort(charWord1);
        Arrays.sort(charWord2);
        return Arrays.equals(charWord1,charWord2);
    }
}
