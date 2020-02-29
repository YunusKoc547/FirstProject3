package replpractice;

import java.util.Scanner;

public class MiddleThree_73 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int wordLength = word.length();
        int middle = wordLength/2;
        char character = word.charAt(middle);



        if (wordLength % 2 != 0 && wordLength >= 5) {
            System.out.println("" + word.charAt(middle-1) + character + word.charAt(middle+1));
        }else {
            System.out.println("invalid");
        }

    }
}
