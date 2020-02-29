package replpractice;

import java.util.Scanner;

public class ArraysFindSum_115 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers
        //TODO: Write your code below
        int length = nums.length;
        int sum = 0;

        for (int x = 0; x < length; x++) {
            int currentItem = nums[x];
            sum = sum + currentItem;
        }
        System.out.println(sum);


    }
}
