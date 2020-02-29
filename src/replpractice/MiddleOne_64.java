package replpractice;

import java.util.Scanner;

public class MiddleOne_64 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        int middle = word.length()/2;
        char middleChar = word.charAt(middle);
        if (word.length()%2==1 && word.length()>=3) {
            System.out.println(middleChar);
        }else if (word.length()==1) {
            System.out.println(word + word + word);
        }else {
            if (word.length()%2==0 && word.length()>=4) {
                System.out.println(word.substring(middle-1, middle+1));
            }else if (word.length()==2) {
                System.out.println(word + word);
            }
        }



    }
}
