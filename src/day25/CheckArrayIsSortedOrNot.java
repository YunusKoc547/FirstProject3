package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int [] nums = {13,31,8,5,21,2};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        // I want to copy the content of nums array in the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
        numsCopy[0] = nums[0];  // 13; coping one by one from original array
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];
        numsCopy[5] = nums[5];

        for (int x = 0; x < numsItemCount ; x++) {
            numsCopy[x] = nums[x]; // this line is coping nums array items into numsCopy array one by one
        }

        System.out.println("Before sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(nums);
        System.out.println("After sort nums = " + Arrays.toString(nums));

        if (Arrays.equals(nums, numsCopy)) {
            System.out.println("THIS ARRAY IS ALREADY SORTED");
        }else {
            System.out.println("THIS ARRAY IS NOT SORTED");
        }

        // plain english logic to see a set of 7 number is sorted or not
        // you copy this 7 number in another container
        // sort the number and check

    }
}
