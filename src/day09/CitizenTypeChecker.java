package day09;

import java.util.Scanner;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String citizenType;

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        if (age >= 65) {
            citizenType = "you are a senior";
            System.out.println(citizenType);
        }

        else {
            citizenType = "you are not a senior";
            System.out.println(citizenType);
        }
        System.out.println("THE END");






    }
}
