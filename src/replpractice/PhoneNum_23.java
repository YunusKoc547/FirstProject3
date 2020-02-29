package replpractice;

import java.util.Scanner;

public class PhoneNum_23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();

        String phoneNumber = "Calling number (" + areaCode +  ")-"+ localNumber;

        System.out.println(phoneNumber);




    }
}
