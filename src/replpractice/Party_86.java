package replpractice;

import java.util.Scanner;

public class Party_86 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        String yesOrNo = "";
        String guestName = "";
        String guestLists = "";
        do {
            System.out.println("Please enter guest name:");
            guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            yesOrNo = input.next();
            guestLists = guestLists + guestName +  ", " ;
        }while (yesOrNo.equals("yes"));

        System.out.println("Guest's list: " + guestLists.substring(0,guestLists.length()-2)) ;



    }
    }












