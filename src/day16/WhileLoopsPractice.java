package day16;

import java.util.Scanner;

public class WhileLoopsPractice {

    public static void main(String[] args) {

//        int apples = 1;
//        while (apples <=10) {
//            System.out.println("Eating an apple");
//            apples++;
//        }
//        System.out.println("No more apples");


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number");
//
//        int number = scan.nextInt();
//        int count;
//
//        count = 1;
//        while (count <=number) {
//            System.out.println(count);
//            count++;
//        }

                Scanner scan = new Scanner(System.in);
                int total = 0;
                System.out.println("Enter a positive integer");
                int nextNum = scan.nextInt();

                while (nextNum > 0) {
                    total = total + nextNum;
                    nextNum = scan.nextInt();
                }
        System.out.println("Sum of all numbers: " + total);




    }
}
