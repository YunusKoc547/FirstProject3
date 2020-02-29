package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        // 'B' is represented by 66 in ascii table
        // here type char is automatically widened to int
        // and stored as number

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 ='b';
        System.out.println(letterInNumber2);

        //---------------------------------------

        char myFirstChar = 100 ;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name

        int letterOne = 'Y';
        int letterTwo = 'U';
        int letterThree = 'N';
        int letterFour = 'U';
        int letterFive = 'S';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);

        char letterA = 'a';
        // adding a character to a int number will result in it
        // (int) letterA + 1
        System.out.println(letterA +1);

        System.out.println(" " + letterA + 1);





































































































































































































    }
}
