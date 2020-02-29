package day29;

import java.util.Arrays;

public class FillUpStringArray {

    public static void main(String[] args) {

        String[] sentence = new String [300];

        sentence[0] = "I Love Java";
        sentence[1] = "I Love Java";
        sentence[2] = "I Love Java";

        for (int i = 0; i < sentence.length; i++) {
            sentence[i] =(i+1) +  ". I Love Java";
        }
        System.out.println("Arrays.toString(sentence) = " + Arrays.toString(sentence));

        String[] str = new String[5];
        str[0] = "I Love Java";
        str[1] = "I Love Java";
        str[2] = "I Love Java";


    }
}
