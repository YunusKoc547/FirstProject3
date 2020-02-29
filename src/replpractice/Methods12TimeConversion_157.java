package replpractice;

import java.util.Scanner;

public class Methods12TimeConversion_157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String wH=s.substring(s.indexOf(':'));
        if (s.substring(0,2).equals("12")&&s.contains("AM")){
            System.out.println("00:00:00");
            return;
        }
        if(wH.contains("PM")){
            s=Integer.parseInt(s.substring(0,s.indexOf(':')))+12+wH.replace("PM","");
        }
        s=s.replace("AM","");
        System.out.println(s);


    }
}
