package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your order? I want the same!");
        String yourOrder = scan.nextLine();
        String myOrder = scan.nextLine();

        System.out.println("Your order is " + yourOrder + "\n" + "My order is " + myOrder +  " as well" );

    }
}
