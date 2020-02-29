package day17;

import java.util.Scanner;

public class NamePrinterWhileLoopScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name:");

        String name = scan.nextLine();

        int num = 0;

        while (num < name.length()) {
            System.out.print("Index of " + num + ": ");
            System.out.println(name.charAt(num));
            ++num;
        }
    }
}
