package day12;

import java.util.Scanner;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("PLease enter a number to represent the month: ");
        int month = scan.nextInt();

        if ( month <1 || month > 12) {
            System.out.println("INVALID MONTH");
        }
        else if (month >=3 && month <= 5) {
            System.out.println("It's Spring");
        }
        else if (month >=6 && month <= 8) {
            System.out.println("It's Summer");
        }
        else if (month >=9 && month <= 11) {
            System.out.println("It's Fall");
        }
        else if (month == 12 || month ==  1 || month ==  2) {
            System.out.println("It's Winter");

        }
    }
}
