package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        // nextLine method of Scanner is used to capture whole

        String name = scan.nextLine();

        System.out.println("You have entered " + name);

        System.out.println("What city do you live in? ");

        String city = scan.nextLine();

        System.out.println("You have entered " + city);

        System.out.println("What is your street address? ");

        String address = scan.nextLine();

        System.out.println("You have entered " + address);

        // Task 4
        // Use nextLine to ask your bio
        // What's your name
        // Which city do you live in, including stateSystem.out.println();
        // What is your street address
















    }
}
