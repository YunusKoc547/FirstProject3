package replpractice;

import java.util.Scanner;

public class OddEven_42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //CODE HERE

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }else if (number % 2 != 0) {
            System.out.println(number + " is odd");
        }else {
            System.out.println(number + " is even");
        }







    }

}