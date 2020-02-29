package day09;

import jdk.swing.interop.SwingInterOpUtils;

public class DayPrinter_Version2 {

    public static void main(String[] args) {

        // if the daycode is 1 = Monday
        // if the daycode is 2 = Tuesday
        // if the daycode is 3 = Wednesday
        // if the daycode is 4 = Thursday
        // if the daycode is 5 = Friday
        // if the daycode is 6 = Saturday
        // if the daycode is 7 = Sunday
        // if none of the above just print unknown day

        int dayCode = 5;
        String dayName = ""; // assigning a empty String value



        if (dayCode == 1) {
            dayName = "Monday";
            System.out.println("THE SCHOOL WEEK BEGINS!");

        } else if (dayCode == 2) {
            dayName = "Tuesday";
            System.out.println("IT'S THE SECOND DAY OF THE WEEK!");

        } else if (dayCode == 3) {
            dayName = "Wednesday";
            System.out.println("HALF THE SCHOOL WEEK LEFT!");

        } else if (dayCode == 4) {
            dayName = "Thursday";
            System.out.println("JUST ONE MORE DAY TO GO!");

        } else if (dayCode == 5) {
            dayName = "Friday";
            System.out.println("IT'S FRIDAYYYY!!");

        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("YAY THE WEEKEND IS HERE!");

        } else if (dayCode == 7) {
            dayName = "Sunday";
            System.out.println("SUNDAY NIGHT FOOTBALL!");

        } else {
            dayName = "Unknown";

        }

        System.out.println("The day is " + dayName);


    }


}
