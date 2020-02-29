package day28;

import java.util.Arrays;

public class ExcelVisualizer {

    public static void main(String[] args) {

        int[] row1 = new int[]{78,54,100,84};
        int[] row2 = new int[]{33,44,77,123};
        int[] row3 = new int[]{12,88,52,76};
        int[] row4 = new int[]{67,33,98,67};
        int[] row5 = new int[]{12,88,52,45};
        int[] row6 = new int[]{67,33,98,34};

        // to store this in another array object

        int[][] sheet = new int[][]{row1,row2,row3,row4,row5,row6};

        int[][] myExcel =  {{10,27},{87,99,100},{90,100}};
//                            0         1          2

        // print 100
        System.out.println(myExcel[1][2]);
        System.out.println(myExcel[2][0]);
        // in this 2d array object, we have 3 1D array object stored
        System.out.println(myExcel.length);
        // how many item do I have in first item of this 2D array
        System.out.println(Arrays.toString(myExcel[0]));
        System.out.println(myExcel[0].length); // getting the length of first 1D array
        System.out.println(myExcel[1].length); // getting the length of second 1D array
        System.out.println(myExcel[2].length); // getting the length of third 1D array

        // how can I make above code better by loop and get the item count of each 1D array
        for (int x = 0; x < myExcel.length ; x++) {
            System.out.println("Item number " + (x + 1) + " length " + myExcel[x].length);
        }


    }
}
