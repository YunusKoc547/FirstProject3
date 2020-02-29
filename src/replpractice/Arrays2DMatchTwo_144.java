package replpractice;

import java.util.Scanner;

public class Arrays2DMatchTwo_144 {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int rows=inp.nextInt(),cols=inp.nextInt();
        int arr[][]=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j]=inp.nextInt();
            }
        }
        int matches=0;
//your code here

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols-1;j++){
                if (arr[i][j]==arr[i][j+1]){
                    matches++;
                }
            }
        }
        System.out.print("matches: " + matches);
    }

}
