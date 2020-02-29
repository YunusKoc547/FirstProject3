package day19;

import day06.UsingTheValueOfOtherVariables;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // from 1-100 print out all the  numbers that can be divided by 15 with no remainder
        // from 1-100 count how many numbers can be divided by 15

//        int count = 0;
//
//        for (int i = 1; i < 100 ; i++) {
//            if (i % 15 == 0) {
//                //System.out.println(i + " can be divided by 15");
//                ++count; // count += 1
//            }
//        }
//        System.out.println("count = " + count);

        // given a String with value
        // find out how many a showed in this String

        String name = "Yunus Koc";

        int countOfA = 0;
       // System.out.println(name.charAt(0) == 'a');

        for (int x = 0; x < name.length() ; x++) {
            //System.out.println(name.charAt(x));

            if (name.charAt(x) == 'u') {
                //System.out.println("BINGO FOUND IT!!");
                ++countOfA;
            }

        }
        System.out.println("countOfA = " + countOfA);







    }
}
