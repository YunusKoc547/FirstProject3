package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintFirstLastChar2_140 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String newArrayWord[]=new String[words.length];

        for (int i = 0; i < words.length; i++) {
            newArrayWord[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(newArrayWord));


    }
}
