package replpractice;

import java.util.Scanner;

public class ArraysCountEvens_121 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        int evenCount = 0;

        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
}
