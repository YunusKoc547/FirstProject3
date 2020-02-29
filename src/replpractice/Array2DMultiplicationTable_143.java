package replpractice;

import java.util.Arrays;

public class Array2DMultiplicationTable_143 {

    public static void main(String[] args) {

        int [][] multiplicationTable = new int[10][10];

        //TODO: type your code below

        int count = 1;
        for (int rows = 0; rows < multiplicationTable.length ; rows++) {
            for (int columns = 0; columns < multiplicationTable.length ; columns++) {
                multiplicationTable[rows][columns]=count*(columns+1);
            }
            count++;
        }


        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}
