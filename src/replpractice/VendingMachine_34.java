package replpractice;

import java.util.Scanner;

public class VendingMachine_34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();





        if (itemPrice < 25 || itemPrice> 100) {
            System.out.println("Invalid price!");
        }
        else if (itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        }
        else {
            int quarters = (100 - itemPrice) / 25;
            int dimes = ( 100 - itemPrice ) % 25 / 10;
            int nickels = ( 100 - itemPrice) % 25 % 10 / 5;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }




    }
}
