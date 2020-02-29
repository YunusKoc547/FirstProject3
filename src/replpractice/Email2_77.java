package replpractice;

import java.util.Scanner;

public class Email2_77 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int emailIndex = email.length()-1;
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfPeriod = email.indexOf(".");




        System.out.println("First name: " + email.toUpperCase().charAt(0) +  email.substring(1,indexOf_));
        System.out.println("Last name: " + email.toUpperCase().substring(indexOf_ + 1,indexOf_ + 2) +  email.substring(indexOf_ + 2,indexOfAt ));
        System.out.println("Domain: " + email.substring(indexOfAt + 1,indexOfPeriod));
        System.out.println("Top-Level Domain: " + email.substring(indexOfPeriod + 1));
    }
}
