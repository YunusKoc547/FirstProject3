package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitEmail_119 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String email = input.nextLine();

    //Write your code below

    String[] emailSplit = email.split("@");

    if (!email.contains("@") || emailSplit.length > 2 ) {
        System.out.println("invalid email");
    }else if (email.contains("@")) {
        System.out.println("Email id: " + emailSplit[0]);
        System.out.println("Email domain: " + emailSplit[1]);
    }



}
}
