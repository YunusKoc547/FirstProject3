package replpractice;

import java.util.Scanner;

public class PrefixAgain_99 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String word=str.substring(0,n);
        System.out.println(str.substring(n).contains(word));


    }
}
