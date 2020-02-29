package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting02_117 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
        System.out.println(arr[0] + " , " +  arr[1]);
        System.out.println(arr[2] + " , " + arr[3]);
        System.out.println(arr[4] + " , "  + arr[5]);
        System.out.println(arr[6] + " , "  + arr[7]);


    }
}
