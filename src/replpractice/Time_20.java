package replpractice;

import java.util.Scanner;

public class Time_20 {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        int hour   = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        String amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
    }
}
