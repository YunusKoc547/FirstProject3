package replpractice;

import java.util.Scanner;

public class Factorial_92 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int number = 1;

        for (int i = 1; i <= n ; i++) {
            number = number * i;
        }
        System.out.println(number);

    }
}
