package replpractice;

import java.util.Scanner;

public class ArraysDiving_132 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE


        for (int i = 0; i < score.length ; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        float min = score[0];
        for (int i = 0; i < score.length ; i++) {
            if (min < score[i]) {
                min = score[i];
            }
        }

        float max = score[0];
            for (int i = 0; i < score.length ; i++) {
                if (max > score[i]) {
                    max = score[i];
            }
        }
            float sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        double total = 0;
        total = (sum - (min + max)) * difficulty * 0.6;





        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
