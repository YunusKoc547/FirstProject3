package day12;

public class Task3_FizzNumber {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("This is a FizzBuzz Number");
        } else if (num % 5 == 0) {
            System.out.println("This is a Fizz Number");
        } else if (num % 3 == 0) {
            System.out.println("This is a Buzz Number");
        } else {
            System.out.println("NOT MY NUMBER!!!");

        }
    }
}
