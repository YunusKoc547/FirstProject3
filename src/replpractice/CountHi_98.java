package replpractice;

import java.util.Scanner;

public class CountHi_98 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.substring(i).startsWith("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
