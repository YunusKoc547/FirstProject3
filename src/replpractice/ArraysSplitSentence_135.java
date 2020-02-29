package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitSentence_135 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[] split = sentence.split(" ");
        for (String eachSplit : split) {
            System.out.println(eachSplit);
        }
    }
}
