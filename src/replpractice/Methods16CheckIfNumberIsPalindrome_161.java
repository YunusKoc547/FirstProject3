package replpractice;

import java.util.Scanner;

public class Methods16CheckIfNumberIsPalindrome_161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        int reversed = 0;
        int nums = num;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed == nums);


    }
}
