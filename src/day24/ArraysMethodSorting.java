package day24;

import day06.UsingTheValueOfOtherVariables;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {


        int[] scores = {99, 44, 66, 23, 19, 55};

        System.out.println(Arrays.toString(scores));
        System.out.println("first item value :  " + scores[0]);

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("first item value :  " + scores[0]);

        System.out.println("------- CHARACTER SORTING ------");
        char[] nameChars = {'G', ' ', 'd', 'Z', '9', 'A'};
        System.out.println("nameChars =               " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));

        // the low to high order for characters is decided by it's ascii table value

        System.out.println("------ STRING SORTING ------");
        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println("Before sorting superHeroes = " + Arrays.toString(superHeroes));
        Arrays.sort(superHeroes);
        System.out.println("After sorting superHeroes = " + Arrays.toString(superHeroes));

        // only the first character matters in String sorting
        // EVEN FOR NUMBERS!!!

        System.out.println("------------- boolean sorting --------------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        // Array.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY


    }

}
