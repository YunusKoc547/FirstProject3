package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        /*

        Voting Eligibility Program
        Create a variable called as as int
        Check whether age is more than or equal to 18
        if yes: you are ready to vote!!
        if no: wait until you are 18

        */

        /*
        Create a program to guess your favorite number
        Create a variable called myFavoriteNumber as int
        Ask user to guess your favorite number
        if user guesses right then print BINGO!!
        if not print try again later
         */



        Scanner scan = new Scanner(System.in);

        System.out.println("Guess my favorite number!");
        int myFavoriteNumber = scan.nextInt();

        System.out.println("You guessed " + myFavoriteNumber);



        if(myFavoriteNumber == 22) {

            System.out.println("BINGO!!!");

        }

        else {

        System.out.println("Try again later!"); }
    }


}
