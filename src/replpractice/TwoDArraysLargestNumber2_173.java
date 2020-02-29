package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysLargestNumber2_173 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below

        int largestNumber = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > largestNumber) {
                    largestNumber = arr[i][j];
                }
                arr[i][j] = largestNumber;
            }
        }
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = largestNumber;
            }
        }




        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}
