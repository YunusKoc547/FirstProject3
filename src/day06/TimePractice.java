package day06;

import java.util.Scanner;

public class TimePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the minutes you would like to convert? ");

        int minutes = scan.nextInt();
        int hourPart = minutes/60;
        int minutesPart = minutes%60;

        System.out.println(minutes + " minutes is " + hourPart + " hours and " + minutesPart + " minutes.");

























    }
}
