package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = {  // this is the beginning of the 2D array object
                             {10,27,88,99}, // index 0 : this is the first 1D array
                             {87,100},      // index 1 : this is the second 1D array
                             {90,45,65}};   // index 2 : this is the third 1D array

        System.out.println(Arrays.deepToString(myExcel));

        for (int[] eachRow : myExcel) {
            for (int eachCell : eachRow) {
                System.out.println(eachCell + " ");
            }
            System.out.println();
        }
    }
}
