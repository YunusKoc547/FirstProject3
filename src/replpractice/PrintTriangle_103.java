package replpractice;

import java.util.Scanner;

public class PrintTriangle_103 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star = "";

        for (i = 0; i < n ; i++) {
           star += "*";
            System.out.println(star);
        }
    }
}
