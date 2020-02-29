package replpractice;

import java.util.Scanner;

public class Methods14PrintUniqueNumbers_159 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        int i,j;
        int count;
        boolean[] test = new boolean[nums.length];
        for(i=0; i<nums.length; i++){
            if(!test[i]){
                count= 1;
                for(j=i+1; j<nums.length;j++){
                    if(nums[j] == nums[i])
                    {
                        count++;
                        test[j] = true;
                    }
                }
                if(count == 1){
                    System.out.println(nums[i]);}
            }
        }

    }
}
