package replpractice;

import java.util.Scanner;

public class CountJava_97 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.substring(i).startsWith("java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}

