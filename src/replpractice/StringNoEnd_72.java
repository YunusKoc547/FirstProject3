package replpractice;

import java.util.Scanner;

public class StringNoEnd_72 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int txtLength = txt.length()-1;

        System.out.println(txt.substring(0,txtLength));
    }
}
