package replpractice;

import java.util.Scanner;

public class WithoutXx_79 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("X") | word.startsWith("x") && word.endsWith("x") | word.endsWith("X")) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
            System.out.println(word.substring(1));
        } else if (word.charAt(word.length() - 1) == 'x' || word.charAt(word.length() - 1) == 'X') {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);
        }
    }
}