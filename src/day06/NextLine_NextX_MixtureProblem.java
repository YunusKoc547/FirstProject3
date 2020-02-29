package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age? ");
        int age = scan.nextInt();
        scan.nextLine();
        // Notice we are not storing this into a variable
        // We just want below line to capture ENTER keyboard input
        // so that it does not accidentally get captured by
        // the NextLine we use to capture address
        System.out.println("Your age is " + age);

        System.out.println("What is your address? ");
        String address =  scan.nextLine();
        System.out.println("Your address is " + address);
















    }
}
