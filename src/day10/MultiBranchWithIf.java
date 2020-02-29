package day10;

import javax.swing.*;

public class MultiBranchWithIf {

    public static void main(String[] args) {

        // At the McDonald's dive thru
        System.out.println("Welcome to McDonald's, what can I get for you? ");

        /*

        11 = Burger
        5 = French Fries
        8 = Chicken Nuggets
        35 = Ice Cream

         */

        String order = "";
        int itemNumber = 11;

        if (itemNumber == 11){
            System.out.println("You have selected 11");
            order = "Burger";
        }
        else if (itemNumber == 5){
            System.out.println("You have selected 5");
            order = "French Fries";
        }
        else if (itemNumber == 8){
            System.out.println("You have selected 8");
            order = "Chicken Nuggets";
        }
        else if (itemNumber == 35)
        {
            System.out.println("You have selected 35");
            order = "Ice Cream";
        }
        else {
            System.out.println("You have selected an unknown item number");
            order = "Unknown";
        }
        System.out.println("Your order is " + order);



    }
}
