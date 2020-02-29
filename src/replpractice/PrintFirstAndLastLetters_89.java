package replpractice;

import java.util.Scanner;

public class PrintFirstAndLastLetters_89 {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int wordLength = word.length()-1;

        System.out.println(word.substring(0,1) + word.substring(wordLength));
    }
}
