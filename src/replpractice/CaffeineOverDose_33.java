package replpractice;

import java.util.Scanner;

public class CaffeineOverDose_33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int mgOfCaffeine = scan.nextInt();

        int caffeineLimit = 10000;

        int drinkLimit = (caffeineLimit / mgOfCaffeine);

        System.out.println("It would take about " + drinkLimit + " drinks for a lethal overdose.");




    }

}
