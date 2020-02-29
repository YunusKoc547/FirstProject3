package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseSentence_137 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] split = sentence.split(" ");

        for (int i = split.length - 1; i >= 0 ; i--) {
            System.out.println(split[i]);
        }
    }
}
