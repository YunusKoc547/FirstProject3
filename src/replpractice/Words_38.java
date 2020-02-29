package replpractice;

import java.util.Scanner;

public class Words_38 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        if (word1.equals(word2)) {
            System.out.println("word1 equals word2");
        }else if (!word1.equals(word2)) {
            System.out.println("word1 does not equal word2");
        }
    }
}
