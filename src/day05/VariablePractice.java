package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive data types
        /*
        Block comment, everything in between will be seen as comment

       Whole numbers        : byte, short, int, long
       Fractional Numbers   : float, double
       Logical              : boolean (true, false)
       Character            : char (single character in single quote)

        Usually by default for whole numbers : just use int
        Usually by default for fractional numbers : just use double

        Is String part of Primitive types? : NOOO!!
        String is sequence of character

        */

        // Task 1: Age Calculator
        // given birth year, please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        // I was born in the year 2001. and I am 18 years old;
        // System.out.println("I was born in year " + 2001 +", and I am " + (2019-2001) + " years old");
        System.out.println("I was born in the year " + birthYear + ", and I am " + age + " years old.");

        // Task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph above the speed limit
        // speedLimit as int, currentSpeed as int, overTheLimit as int

        int speedLimit = 55;
        int currentSpeed = 65;
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("I was driving " + currentSpeed + "mph but the speed limit was " + speedLimit + "mph, so I was driving " + overTheLimit +  "mph over the speed limit.");



    }

}
