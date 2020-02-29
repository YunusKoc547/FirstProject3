package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {
        int[] myNumbers = new int[] {5,3,21,2,1,13,8};
        int size = myNumbers.length;
        int lastIndex = size-1;
        int middleIndex = size / 2;

        System.out.println(Arrays.toString(myNumbers));

        System.out.println("--- loop starts here ---");

        for (int x = 0; x < middleIndex; x++) {
            System.out.println("Before swap: " + myNumbers[x]);
        }
    }
}
