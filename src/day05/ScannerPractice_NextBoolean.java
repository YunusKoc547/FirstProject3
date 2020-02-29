package day05;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {

    public static void main(String[] args) {

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // asking user are you recording
        System.out.println(" are you recording?");
        boolean isRecording = input.nextBoolean();

        // The result on concatenating a String to any data type will always result in another String
        System.out.println("We are recording " + isRecording);






    }
}
