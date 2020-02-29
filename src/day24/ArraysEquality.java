package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22,45,6,37,3,6,9};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {6,5,6,7,3,34,2};

        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        // for checking for equality of 2 array object content
        // equals -->> Arrays.equals (firstArray, secondArray)
        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("is score1 the same as score2 = " + isS1S2Equals);

        boolean isS1S3Equal = Arrays.equals(scores1,scores3);
        System.out.println("is score1 the same as score3 = " + isS1S3Equal);

        boolean isS1S4Equal = Arrays.equals(scores1,scores4);
        System.out.println("is score1 the same as score4 = " + isS1S4Equal);
    }
}
