package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {


        // checking for String equality should always be
        // done using equals method of the String

        // oneString.equals(anotherString) --->> true or false
        // equals method coming from String class
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equals method
        // This is something that you will rarely do
        //System.out.println("Java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));
        // IntelliJ display original as helper, it is not part of your code
        // please ignore and keep typing. do not type original, just type your text
        String yourStr = new String("Java");

        System.out.println("is my string the same as your string?");
        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));



        // create a program to check whether myStr value is Java
        // if true -->> correct word!!
        // if false -->> say java!!

        if (myStr.equals("Java") ){
            System.out.println("CORRECT WORD !!!!!!");
        }
        else {
            System.out.println("SAY JAVA !!!!!!");
        }
    }
}
