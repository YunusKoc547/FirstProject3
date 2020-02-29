package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {


        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString -->> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals -->> Arrays.equals(firstArray, secondArray)

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(superHeroes));

        String superHeroesAsString = Arrays.toString(superHeroes);
        System.out.println(superHeroesAsString);

        System.out.println(superHeroesAsString.charAt(0));

        int[] numbers = {10,44,55,3,78};
        System.out.println( Arrays.toString(numbers));

        // create a double array of 3 items; and put 3 values
        // get a String representation out of this array and save it as pricesString
        // print each and every character in this String
        // character at index 1 is : yourCharacterHere
        // character at index 2 is : yourCharacterHere and so on all the way until last
        }
    }

