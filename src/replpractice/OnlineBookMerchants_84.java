package replpractice;

import java.util.Scanner;

public class OnlineBookMerchants_84 {

    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer && nbooksPurchased >= 5 && nbooksPurchased <8) {
            System.out.println(freeBooks = freeBooks + 1);
        }else if (isPremiumCustomer && nbooksPurchased >= 8) {
            System.out.println(freeBooks = freeBooks + 2);
        }else if (!isPremiumCustomer && nbooksPurchased >= 7 && nbooksPurchased < 12) {
            System.out.println(freeBooks = freeBooks + 1);
        }else if (!isPremiumCustomer && nbooksPurchased >= 12) {
            System.out.println(freeBooks = freeBooks +2);
        }else {
            System.out.println(freeBooks);
        }
    }
}
