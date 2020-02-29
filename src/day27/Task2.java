package day27;

public class Task2 {

    public static void main(String[] args) {
        // Write a program that can find the minimum number from an array
        // DO NOT use sort method
        int[] scores = {100, 90, 900, 8000, 10, 20, -1};
        int min = 99999999;
        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        System.out.println("Minimum number: " + min);
        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[0] == min) {
                continue;
            }
            if (secondMin > scores[i]) {
                secondMin = scores[i];
            }
        }
        System.out.println("Second minimum number is: " + secondMin);
        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min || scores[i] == secondMin) {
                continue;
            }
            if (thirdMin > scores[i]) {
                thirdMin = scores[i];
            }
        }
        System.out.println("Third minimum number is: " + thirdMin);
    }
}
