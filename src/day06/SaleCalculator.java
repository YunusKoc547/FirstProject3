package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        double regularPrice;
        double salePrice;
        double discount;

        System.out.println("What is the regular price? ");
        regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate? ");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println("The regular price is $" + regularPrice + ", the discount is $" + discount +  " and your deal is $" + salePrice);















    }
}
