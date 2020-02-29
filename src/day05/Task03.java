package day05;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many days?");

        double minutesInDay = scan.nextDouble();

        double minutes = (minutesInDay * 1440);

        System.out.println("That amount of days has  " + minutes + " minutes");



    }
}
