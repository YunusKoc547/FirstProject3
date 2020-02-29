package replpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack2_170 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int day=0;
        int temp[]=new int[8];
        int zeros[]={0, 0, 0, 0, 0, 0, 0, 0};

        do{
            System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
            for (int i = 0; i <temp.length ; i++) {
                temp[i]=inhabitants[i];
            }
            for (int i = 0; i <8 ; i++) {
                if (i == 0 && temp[0] == 0){
                    inhabitants[1]=temp[1]/2;
                } else if(i == 7 && temp [7] == 0){
                    inhabitants[6] = temp [6] / 2;
                } else if(temp[i] == 0){
                    inhabitants[i - 1] = temp[i - 1] / 2;
                    inhabitants[i + 1] = temp[i + 1] / 2;
                }
            }day++;
        }while(!Arrays.equals(inhabitants,zeros));

        System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));

        System.out.println("---- EXTINCT ----");
    }
}
