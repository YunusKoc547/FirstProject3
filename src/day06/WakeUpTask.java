package day06;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much is the regular price of what you want to buy? ");
        double regularPrice = scan.nextDouble();
        System.out.println("How much is the item discounted by?");
        double amountOff = scan.nextDouble();
        double finalPrice = (regularPrice - amountOff);

        System.out.println("The regular price is $" + regularPrice + ", The item is $" + amountOff + " off, making the final price $" + finalPrice);


    }
}
