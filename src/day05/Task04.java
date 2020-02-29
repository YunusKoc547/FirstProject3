package day05;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your hourly wage? ");

        double hourlyWage = scan.nextDouble();

        int yearlyHours = 2080;

        double annualSalary = (hourlyWage * yearlyHours);

        System.out.println("Your annual salary is " + annualSalary);








    }
}
