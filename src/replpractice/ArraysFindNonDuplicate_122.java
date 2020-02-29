package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFindNonDuplicate_122 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int i = 0; i < nums.length; i++) {
            int equalCount = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    equalCount++;
                }
            }
            if (equalCount == 1) {
                System.out.println(nums[i]);
                break;
            }
        }






    }
}
