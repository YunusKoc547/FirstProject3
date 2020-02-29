package day26;

import java.util.Arrays;

public class ArrayTask_NumberTest {

    /*
    given an int array
    write a program to test all the element in this int array are more than 100
     */

    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110};

        // create a variable called finalResult

        for (int each : scores) {
            if (each > 100) {
                boolean finalResult = true;
                System.out.println(each + " is greater than 100 : " + finalResult);
            } else {
                boolean finalResult = false;
                System.out.println(each + " is greater than 100 : " + finalResult);
            }
        }

        System.out.println();

        for (int each : scores) {
            if (each < 100) {
                boolean finalResult = true;
                System.out.println(each + " is less than 100 : " + finalResult);
            }else{
                boolean finalResult = false;
                System.out.println(each + " is less than 100 : " + finalResult);
            }


        }
    }
}