package replpractice;

import java.util.Scanner;

public class ArraysCountOfEvenNumber_116 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
        int length = nums.length;
        int countOfEvens = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0) {
               countOfEvens++;
            }
        }
        System.out.println(countOfEvens);

    }
}
