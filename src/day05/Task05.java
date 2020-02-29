package day05;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for potato? ");
        float potatoPrice = scan.nextFloat();

        System.out.println("How many potatoes do you want to buy? ");
        int potatoCount = scan.nextInt();
        float totalPrice = (potatoPrice * potatoCount);

        System.out.println("Your total for potato is " + totalPrice);

scan.nextLine();
scan.nextDouble();












    }
}
