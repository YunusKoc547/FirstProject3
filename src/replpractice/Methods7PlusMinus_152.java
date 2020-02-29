package replpractice;

import java.util.Scanner;

public class Methods7PlusMinus_152 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

            plus_minus(arr);
    }//end main

    public static void  plus_minus(int[] nums) {
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1) {
                positives++;
            }else if (nums[i] <= -1) {
                negatives++;
            }else {
                zeroes++;
            }
        }


        System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros: " + zeroes);
    }
}

