package replpractice;

import java.util.Scanner;

public class ParseJSONFile_104 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String json = scan.nextLine();
            int indexOfFirst = json.indexOf("firstName\":")+13;
            int indexOfLast = json.indexOf("lastName\":")+12;

            String firstName = json.substring(indexOfFirst,json.indexOf("\","));
            String lastName = json.substring(indexOfLast,json.indexOf("\", \"role\""));
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);

    }
}
