package replpractice;

import java.util.Scanner;

public class ArraysPrintFirstLastChar1_110 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (String eachWord : words) {
            System.out.println("" + eachWord.charAt(0) + eachWord.charAt(eachWord.length()-1));
        }
    }
}
