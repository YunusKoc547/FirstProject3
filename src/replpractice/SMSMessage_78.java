package replpractice;

import java.util.Scanner;

public class SMSMessage_78 {

    public static void main(String[] args) {

        // Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        int lessThanSymbol = message.indexOf("<");
        int greaterThanSymbol = message.indexOf(">");
        int firstBracket = message.indexOf("[");
        int secondBracket = message.indexOf("]");
        int firstCurly = message.indexOf("{");
        int secondCurly = message.indexOf("}");


        String sender = message.substring(lessThanSymbol +1,greaterThanSymbol);
        String phoneNumber = message.substring(firstBracket +1,secondBracket);
        String messageBody = message.substring(firstCurly +1, secondCurly);


        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);










    }
}
