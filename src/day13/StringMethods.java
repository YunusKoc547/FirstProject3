package day13;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far

        // equals
        String s1 = "hello";
        System.out.println(s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println( s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of String is used to make String all characters uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());


        // toLowerCase method of String is used
        // to make String all characters lowercase
        System.out.println(s1.toLowerCase());

        // store your name into a variable
        // print your name is all uppercase :
            // you may optionally concatenate "MY NAME IS: MYNAME
        // print your name in all lowercase:
            // you may optionally concatenate "my name is: myName

        String myName = "Yunus";
        System.out.println("MY NAME IS " + myName.toUpperCase());
        System.out.println("my name is " + myName.toLowerCase());

        // In order to get how many character we have inside String
        // we can use length method of String

        System.out.println( s1.length() );

        int lengthOfStr = s1.length();

        if (lengthOfStr > 4) {
            System.out.println("More than 4 characters");
        }
        else {
            System.out.println("not more than 4 characters");
        }
    }
}
