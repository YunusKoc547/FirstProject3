package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiece_139 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        if (num.length > 2) {
            System.out.print("[" + (num[0]) + ", " + (num[1]) + "]");
        }else {
            System.out.println(Arrays.toString(num));
        }




    }
}
