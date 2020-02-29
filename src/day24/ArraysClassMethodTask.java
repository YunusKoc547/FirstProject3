package day24;

import java.util.Arrays;

public class ArraysClassMethodTask {

    public static void main(String[] args) {

        // create a double array of 3 items; and put 3 values
        // get a String representation out of this array and save it as pricesString
        // print each and every character in this String
        // character at index 0 is : yourCharacterHere
        // character at index 1 is : yourCharacterHere and so on all the way until last

        double[] items = {10.99, 5.99, 7.29};

       String pricesString =  Arrays.toString(items);
       System.out.println(pricesString);

        for (int i = 0; i < pricesString.length() ; i++) {
            System.out.println("character at index " + i + " is : " + pricesString.charAt(i) );
        }





    }
}
