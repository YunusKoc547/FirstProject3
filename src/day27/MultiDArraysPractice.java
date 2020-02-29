package day27;

import java.util.Arrays;

public class MultiDArraysPractice {

    public static void main(String[] args) {
        //N dimensional Array MUST contain (N-1) dimensional arrays
        //2 dimensional array MUSt contain (2-1) dimensional arrays
        //                             0       1           0          1
        String [] [] names ={ {"Rukhshona" , "Ghoya"} , {"Hassan", "Tetiana"} };
        //                               0                          1
        // print Hassan:
        System.out.println(names[1] [0]);
        //print Tetiana
        System.out.println(names[1] [1]);
        names[1][1] = "Dilshat";
        //print Hassan & Dilshat
        System.out.println(Arrays.toString(names[1] ) );
        // Print Rukhshona , Ghoya, Hassan, Tetiana
        System.out.println(Arrays.deepToString( names ));
        System.out.println("=========================");
        int [] [] numbers= { {1,2,3} , {4,5,6} , {7,8,9},  {10,11,12,13} };
        //                      0          1         2
        for (int i = 0; i < numbers.length ; i++) { // checks each index of two dimensional array
//           System.out.println(Arrays.toString(numbers[i] ) );
            for (int j = 0; j < numbers[i].length ; j++) { // checks each elements of single dimensional array
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println("\n=========================");
        int[][] ages = { {10}, {12,13,14,16,17}, {19,20,21,22,23}   };
        for (int i = 0; i < ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j] %2 !=0){ // if ages [i][j] %2 == 0
                    continue;
                }
                System.out.print(ages[i][j]+ " ");
            }
        }
    }
}
