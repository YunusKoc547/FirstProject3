package replpractice;

import java.util.Scanner;

public class FindTheLength_62 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String word = scan.next();
        System.out.println("Length is: " + word.length());
    }
}
