package replpractice;

import java.util.Scanner;

public class TwoDArraysDiagonalDifference_172 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;

        int leftToRight = matrix[0][0] + matrix[1][1] + matrix[2][2];
        int rightToLeft = matrix[2][0] + matrix[1][1] + matrix[0][2];

        if (leftToRight >= rightToLeft) {
            result = leftToRight - rightToLeft;
        }else {
            result = rightToLeft - leftToRight;
        }


        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
