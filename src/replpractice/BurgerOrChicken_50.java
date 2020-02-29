package replpractice;

import java.util.Scanner;

public class BurgerOrChicken_50 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        String in = s.next();

        //your code here

        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(10.0);
        }else if (in.equals("soda")) {
            System.out.println(2.0);
        }

    }
}
