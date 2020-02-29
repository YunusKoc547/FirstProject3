package replpractice;

import java.util.Scanner;

public class ArraysPrintShortestWord_125 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortestWord = str[0];
        for (String eachWord : str) {
            if (eachWord.length() < shortestWord.length()) {
                shortestWord = eachWord;
            }
        }
        System.out.println(shortestWord);
    }
}
