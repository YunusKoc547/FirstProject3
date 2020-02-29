package replpractice;

import java.util.Scanner;

public class Methods6SigNum_151 {

    public static void sign(int n)  {
        //your code here

        if (n >= 1) {
            n = 1;
        }else if (n < 0) {
            n = -1;
        }else {
            n = 0;
        }
        System.out.println(n);


    }//end sign

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }
}
