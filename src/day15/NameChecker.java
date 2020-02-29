package day15;

public class NameChecker {

    public static void main(String[] args) {

        String myName = "Yunus";

        if (myName.length() <= 4) {
            System.out.println("Short name");
        }else if (myName.length() >= 5 && myName.length() <= 10) {
            System.out.println("Medium name");
        }else if (myName.length() >= 11) {
            System.out.println("Long name");
        }

        if (myName.contains("a") || myName.contains("e") ) {
            System.out.println("My name contains a or e in my name");
        }else if (!myName.contains("a") || !myName.contains("e")) {
            System.out.println("I don't have a or e in my name");
        }
        System.out.println(myName.charAt(4));
        System.out.println(myName.charAt(3));
        System.out.println(myName.charAt(2));
        System.out.println(myName.charAt(1));
        System.out.println(myName.charAt(0));





    }
}
