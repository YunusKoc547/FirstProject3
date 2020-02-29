package day36;

import java.util.*;

public class MethodPractice2 {

    public static void main(String[] args) {
        long[] myLongs = {6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swap myLongs = " + Arrays.toString(myLongs));

        swapFirstAndLastValue(myLongs);
        System.out.println("After swap myLongs = " + Arrays.toString(myLongs));

        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));


    }

    public static void swapFirstAndLastValue(long[] nums) {

        long temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
    }

}
