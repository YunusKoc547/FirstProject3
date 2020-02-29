package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your starting and ending speed ");
        int i = scan.nextInt();
        int end = scan.nextInt();


        System.out.println("your starting speed is: ");
        for (int start = i ;start <= end; ++start) {
            System.out.print(start + " ");
        }
    }
}
