package day36;

import java.util.Arrays;

public class MethodWithParameterArray {

    public static void main(String[] args) {

        int[] nums = {1,5,3,4,7,2};
        System.out.println("Before change nums = " + Arrays.toString(nums));
        Arrays.sort(nums);
        changeArrayFirstItemTo100(nums);
        System.out.println("After change nums =  " + Arrays.toString(nums));
    }

    public static void changeArrayFirstItemTo100(int[] numbers) {

        numbers[0] = 100;
    }

}
