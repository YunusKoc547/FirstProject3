package day10;

import java.util.Scanner;

public class AnswerScanVersion {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

    String myAnswer = "";


        Scanner scan = new Scanner(System.in);

        int myNumber = scan.nextInt();

    if (myNumber % 5 == 0) {
        myAnswer = "a Fizz Number";
    }
    else if (myNumber % 5 != 0 ) {
        myAnswer = "not a Fizz Number";
    }
    System.out.println("My number is " + myNumber +  ", it is " + myAnswer);
}
}
