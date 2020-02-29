package replpractice;

import java.util.Scanner;

public class FindAUser_59 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter full name:");
        String user = scan.nextLine();

        if (user.equalsIgnoreCase("Max Payne") || user.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }



    }
}

