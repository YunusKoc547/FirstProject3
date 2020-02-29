package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // LOGIC 1 : split this String by "-"
        // to get 2 piece of String into a String array
        String[] heroSplit = hero1.split("-");
        System.out.println(Arrays.toString(heroSplit));

        // Hero code is Superman and Identity is Clark Kent
        System.out.println("Hero code is " + heroSplit[0] + " and identity is " + heroSplit[1]);

        // LOGIC 1 : get the first letter of full name then get the first letter after the space
        // concatenate them
        // downside is what if we have a middle name
        // solution : instead of looking for the letter after first space
        //  look for last index of the space then get next Character

        // LOGIC 2 : We already have full name stored in fullName variable
        //  split by space -->> we will get firstName (middleName) lastName
        //  get the first letter of the full name
        //  get the first character then concatenate
        //  Clark Kent --<< [ Clark Kent, Kent ] Clark->C Kent->K --->> CK

        String[] fullNameSplit = heroSplit[1].split(" ");
        // last name will always be the last element of splt full name
        // no matter the name has middle name or not
        String lastName = fullNameSplit[fullNameSplit.length-1];
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is : " + heroSplit[1].charAt(0) + lastName.charAt(0));
    }
}
