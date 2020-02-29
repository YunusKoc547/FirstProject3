package replpractice;

import java.util.Scanner;

public class TipCalculator_90 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        String and = "&&&&&&&&&&";

        System.out.println("Number of people entered: " + (and.substring(0,numberOfPeople)));




        if (serviceQuality.equals("Poor")) {
            System.out.println("Total to pay: " + (checkAmount + checkAmount * .05));
            System.out.println("Total tip: " + checkAmount * .05);
            System.out.println("Total per person: " + (checkAmount * .05 + checkAmount) / numberOfPeople);
            System.out.println("Tip per person: " + (checkAmount * 0.05) / numberOfPeople);
        }else if (serviceQuality.equals("Fair")) {
            System.out.println("Total to pay: " + (checkAmount + checkAmount * .1));
            System.out.println("Total tip: " + checkAmount * .1);
            System.out.println("Total per person: " + (checkAmount * .1 + checkAmount) / numberOfPeople);
            System.out.println("Tip per person: " + (checkAmount * .1) / numberOfPeople);
        }else if (serviceQuality.equals("Good")) {
            System.out.println("Total to pay: " + (checkAmount + checkAmount * .15));
            System.out.println("Total tip: " + checkAmount * .15);
            System.out.println("Total per person: " + (checkAmount * .15 + checkAmount) / numberOfPeople);
            System.out.println("Tip per person: " + (checkAmount * .15) / numberOfPeople);
        }else if (serviceQuality.equals("Great")) {
            System.out.println("Total to pay: " + (checkAmount + checkAmount * .2));
            System.out.println("Total tip: " + checkAmount * .2);
            System.out.println("Total per person: " + (checkAmount * .2 + checkAmount) / numberOfPeople);
            System.out.println("Tip per person: " + (checkAmount * .2) / numberOfPeople);
        }else if (serviceQuality.equals("Excellent")) {
            System.out.println("Total to pay: " + (checkAmount + checkAmount * .25));
            System.out.println("Total tip: " + checkAmount * .25);
            System.out.println("Total per person: " + (checkAmount * .25 + checkAmount) / numberOfPeople);
            System.out.println("Tip per person: " + (checkAmount * .25) / numberOfPeople);
        }







    }
}
