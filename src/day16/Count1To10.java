package day16;

import java.util.Scanner;

public class Count1To10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number  = scan.nextInt();
        int count = 1;

        while (count <= number) {
            System.out.println(count);
            count++;
        }


    }
}
