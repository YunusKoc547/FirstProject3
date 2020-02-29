package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseSentence2_138 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] split = sentence.split(" ");

        for (int i = split.length - 1; i > 0 ; i--) {
            reversed = reversed + split[i] + " ";
        }
        reversed = reversed + split[0];



        //End your code here. do not modify below statement
        System.out.println(reversed);

    }
}
