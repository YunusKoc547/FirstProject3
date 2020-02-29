package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMakeLast_141 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if (size >= 1) {
            int[] num2 = new int[size * 2];
            int lastIndex = num2.length-1;
            num2[lastIndex] = nums[size-1];
            System.out.println(Arrays.toString(num2));
        }




    }
}
