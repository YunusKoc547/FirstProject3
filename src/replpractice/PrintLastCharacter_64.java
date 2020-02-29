package replpractice;

import java.util.Scanner;

public class PrintLastCharacter_64 {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int lengthOfName = word.length();

        int lastCharacterIndex = lengthOfName-1;
        char lastLetter = word.charAt(lastCharacterIndex);

        System.out.println(lastLetter);


    }
}
