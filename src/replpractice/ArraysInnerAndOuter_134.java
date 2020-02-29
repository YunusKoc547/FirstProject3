package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerAndOuter_134 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        boolean result = true;
        for (int i = 0; i < inner.length; i++) {
            int a = Arrays.binarySearch(outer,inner[i]);
            if (a >= 0) {
                result = true;
            }else {
                result = false;
                break;
            }
        }
        System.out.println(result);

    }
}
