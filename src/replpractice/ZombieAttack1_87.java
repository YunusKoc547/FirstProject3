package replpractice;

import java.util.Scanner;

public class ZombieAttack1_87 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        if (inhabitants > 1) {
        System.out.println("Day " + day + " [" + inhabitants + "]");

            while (inhabitants > 1) {
                day = day + 1;
                System.out.println("Day " + day + " [" + (inhabitants / 2) + "]");

                inhabitants /= 2;
            }

            System.out.println("---- EXTINCT ----");
        }else {
            System.out.println("---- EXTINCT ----");
        }


    }
}
