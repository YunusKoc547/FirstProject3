package day12;

import java.util.Scanner;

public class LoginTestScannerVersion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username and password:");
        String userName = scan.next();
        String password = scan.next();

        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }
        else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username Incorrect");
        }
        else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password Incorrect");
        }
        else if (!userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Username and Password are Incorrect");
        }
    }
}

