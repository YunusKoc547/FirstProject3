package replpractice;

import java.util.Scanner;

public class ArraysHas55_136 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO Type your code below:
       boolean result = false;
        for (int i = 0; i < nums.length ; i++) {
            if (i != nums.length -1 && nums[i] == 5 && nums[i + 1] == 5) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
