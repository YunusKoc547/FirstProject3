package replpractice;

import java.util.Scanner;

public class TernaryOperator2_61 {

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        //WRITE YOUR CODE HERE

        num1 = (num1 > num2) ? num1 : num2;
        System.out.println(num1);


    }
}
