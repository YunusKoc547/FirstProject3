package day10;

public class Answer {

    public static void main(String[] args) {

        String myAnswer = "";

        int myNumber = 7;

        if (myNumber % 5 == 0) {
            myAnswer = "a Fizz Number";
        }
        else if (myNumber % 5 != 0 ) {
            myAnswer = "not a Fizz Number";
        }
        System.out.println("My number is " + myNumber +  ", it is " + myAnswer);
    }
}
