package replpractice;

import java.util.Scanner;

public class ArraysFindingMaxLengthInStringArray_120 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        //write your code below



//        for (int i = 0; i < words.length; i++) {
////            longestWord = words[0];
////            if (words[i].length()> longestWord.length()) {
////                longestWord = words[i];
////            }
////        }
////        System.out.println(longestWord);

        String longestWord = words[0];
        for (String eachWord : words) {
            if (eachWord.length() > longestWord.length()) {
                longestWord = eachWord;
            }
        }
        System.out.println(longestWord);


    }
}
