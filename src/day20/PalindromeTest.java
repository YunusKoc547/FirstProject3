package day20;

import day06.UsingTheValueOfOtherVariables;

public class PalindromeTest {

    public static void main(String[] args) {


        // if you reverse a String if it does not change it means
        // the String is palindrome
        
        String name = "kayak";
        String reversedName = "";

        for (int x = name.length()-1; x >= 0 ; x--) {
            reversedName = reversedName + name.charAt(x);

        }
        System.out.println("name = " + name);
        System.out.println("reversedName = " + reversedName);

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("PALINDROME TEST HAS PASSED");
        }else {
            System.out.println("PALINDROME TEST HAS FAILED");
        }

    }
}
