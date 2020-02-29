package day19;

import java.util.Scanner;

public class SpeedUpOrSlowDown_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your starting and ending speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        // start = i
        if (start < end) {
            System.out.println("INCREASING THE SPEED");
            for (int i = start; i >= end; i++) {
                System.out.println(i + " ");
            }
        }else if (start > end) {
            System.out.println("DECREASING THE SPEED");
            for (int i = start; i < end; i--) {
                System.out.println(i + " ");
            }
        }
        else {
            System.out.println("NO ACTION NEEDED! SAME SPEED!");
        }
    }
}
