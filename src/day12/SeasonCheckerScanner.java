package day12;

import java.util.Scanner;

public class SeasonCheckerScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season please");
        String season = scan.next();

        if ( season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, Biking, planting a garden");
        }
        else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Swimming, beach, sunny vacation");
        }
        else if (season.equalsIgnoreCase("fall")) {
            System.out.println("Soccer, barbecue, rake leaves");
        }
        else if (season.equalsIgnoreCase("winter")) {
            System.out.println("CODE!!!, ski, sledding, snowball fights");
        }
        else {
            System.out.println("INVALID!!!");
        }
    }
}
