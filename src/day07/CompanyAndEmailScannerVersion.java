package day07;

import java.util.Scanner;

public class CompanyAndEmailScannerVersion {

    public static void main(String[] args) {

        System.out.println("Enter your first name, last name, and your company separated by spaces");

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, company, email;
        firstName = scan.next();
        lastName = scan.next();
        company = scan.next();
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println("My name is " + firstName + " " + lastName +  ", I work for " + company + ", and my email is " + email + ".");













    }
}
