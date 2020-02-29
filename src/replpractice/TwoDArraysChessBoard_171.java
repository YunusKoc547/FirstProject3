package replpractice;

import java.util.Arrays;

public class TwoDArraysChessBoard_171 {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i = 0; i <= 7; i++) {
            char eachChar = 'a';
            for (int x = 0; x <= 7; x++) {
                chessBoard[i][x] = "" + (i+1) + eachChar;
                eachChar++;
            }
        }


        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
