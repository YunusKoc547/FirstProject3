package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        // combining multiple condition together
        // in java there is no range check directly like math
        // for example in math : int x = 70
        // 60 < x < 100 = true < 100 (THIS DOES NOT WORK)
        // in Java : x > 60 && x < 100

        // && 2 ampersand  & 1 ampersand --->> Logical AND operator
            // This is used to check if both conditions are true at the same time

        // Think about login example
        // only when your username is right AND your password is right at the same time
        // then you will be able to login


        /*
        int x = 70;     x > 60 && x < 100;  true
        int x = 10;     x > 60 && x < 100;  false
        int x = 110;    x > 60 && x < 100;  false
        int x = 99;     x > 60 && x < 100;  true




        If || then only one side must be true for the statement to be true
        If && then both sides must be true for the statement to be true
         */
        System.out.println("TRUTH TABLE ");

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("RESULT OF true && true is " + (true && true));
        System.out.println("RESULT OF false && true is " + (false && true));
        System.out.println("RESULT OF true && false is " + (true && false));
        System.out.println("RESULT OF false && false is " + (false && false));

        System.out.println("");

        System.out.println("RESULT OF true || true is " + (true || true));
        System.out.println("RESULT OF false || true is " + (false || true));
        System.out.println("RESULT OF true || false is " + (true || false));
        System.out.println("RESULT OF false || false is " + (false || false));


        // Create a variable called num with type int
        // find out whether this number is more than 1000 or less than 10 using above example

        int num = 55;
        System.out.println(num > 10 && num < 100);
        System.out.println(num > 10 && num < 50);
        System.out.println(num > 70 && num < 100);
        System.out.println(num > 50 && num < 70);
        System.out.println(num > 10 && num < 60);

        System.out.println("");

        System.out.println(num > 10 || num < 100);
        System.out.println(num > 10 || num < 50);
        System.out.println(num > 70 || num < 100);
        System.out.println(num > 50 || num < 70);
        System.out.println(num > 10 || num < 60);
        System.out.println(num > 100 || num < 10);

        System.out.println("");

        // more than 2 conditions at the same time, 3 conditions

        System.out.println(true || false || false);
        System.out.println(true && true && false);

        System.out.println( num==50 || num==51 || num==55);

        System.out.println(num > 50 && num!=52 || num==57);





    }
}
