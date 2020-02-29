package day27;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write a program that asks a user to enter a number 5 times, and store those numbers into Array
        int[] numbers =  new int[5];
        //       System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <5; i++) {
            System.out.println("Enter an int number: ");
            int input = scan.nextInt();
            numbers[i] = input;
        }
        System.out.println(Arrays.toString(numbers));
        //Arrays.sort(VariableName): sorts the array in ascending order
        Arrays.sort(numbers);
        int largestNumber = numbers[numbers.length-1];
        int smallestNumber = numbers[0];
        System.out.println("Largest Number is: " + largestNumber);
        System.out.println("Smallest number is: " + smallestNumber);
//        numbers [0] = scan.nextInt();
//        numbers [1] = scan.nextInt();
//        numbers [2] = scan.nextInt();
//        numbers[3] = scan.nextInt();
//        numbers[4] = scan.nextInt();
//
//        System.out.println(Arrays.toString(numbers));
    }
}
