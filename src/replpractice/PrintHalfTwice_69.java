package replpractice;

import java.util.Scanner;

public class PrintHalfTwice_69 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int wordLength = word.length();
        int middle = wordLength/2;
        String firstHalf = word.substring(0, middle) + word.substring(0, middle);
        System.out.println(firstHalf);
    }
}
