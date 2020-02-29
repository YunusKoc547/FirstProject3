package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {
        printArrayItems(new int[] {1,6,5,3,12,3});
        int[] scores = {2,5,8,23,4,5,6};
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores );
        compare2ArraySize(new String[] {"Hello","Hi", "Yunus"}, new String[] {"Rice"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman","Cyborg","Green Lantern"};
        compare2ArraySize(names1,names2);
    }

    public static void printArrayItems(int[] nums) {

        System.out.println("arrays has items : " + Arrays.toString(nums));
    }

    public static void printMaxOfIntArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max number is : " + max);
    }

    public static void printMinOfIntArray(int[] nums) {
        int min = nums[0];
        for (int eachNum : nums) {
            if (eachNum < min) {
                min = eachNum;
            }
        }
        System.out.println("min number is : " + min);
    }

    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int eachNum : nums) {
            sum = sum + eachNum;
        }
        System.out.println("sum = " + sum);
    }

    public static void compare2ArraySize(String[] arr1, String[] arr2) {
        if ( arr1.length > arr2.length) {
            System.out.println("array 1 has more items than array 2");
        }else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more items than array 1");
        }else {
            System.out.println("array 1 and array 2 have the same item count");
        }
    }
}
