package day05;


import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

        // ask user for name
        // capture the result
        // print your name
        // ask user for birth year
        // capture the result
        // print the age !!
        // ask user for height
        // capture result
        // print the height !!

        // Create scanner object
        // you can name your variable whatever you want
        // in below case we are calling it scan
        // Scanner is data type, scan is the name, new scanner (System.in) is the value
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.next();
        System.out.println("My name is " + name);

        System.out.println("What is your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println("your age is : " + age);

        System.out.println("What is your height? ");
        double height = scan.nextDouble();
        System.out.println("you height is : " + height);



        // Getting single word as String ---> scan.next();
        // Getting single number as int ----> scan.nextint();















    }
}
