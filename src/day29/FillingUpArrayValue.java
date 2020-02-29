package day29;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

        // create an int array with size 100 and fill it up as below

        int[] numbers = new int[100];

        System.out.println("Before filling up : \n" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("After filling up : \n" + Arrays.toString(numbers));

    }
}
