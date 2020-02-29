package day10;

import java.util.Scanner;

public class seasonAction {

    public static void main(String[] args) {

        /*

        What do you do in each season

        Spring  = Hike, Easter, Blossom
        Summer = Swim, Vacation, BBQ
        Fall = Black Friday, Hiking, Harvest, Halloween, Shopping
        Winter = Snowboarding, skiing, Christmas, New Years

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey what is the season!?");

        String season = scan.next();

        switch (season) {
            case "Spring" :
                System.out.println("Hike, Easter, Blossom");
                break;
            case "Summer" :
                System.out.println("Swim, Vacation, BBQ");
                break;
            case "Fall" :
                System.out.println("Black Friday, Hiking, Harvest, Halloween, Shopping");
                break;
            case "Winter" :
                System.out.println("Snowboarding, skiing, Christmas, New Years");
                break;
            default :
                System.out.println("Invalid Season Entry");
                break;
        }
    }
}
